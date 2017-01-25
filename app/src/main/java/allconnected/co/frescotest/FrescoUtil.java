package allconnected.co.frescotest;

import android.content.Context;
import android.net.Uri;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * fresco工具类
 */
public class FrescoUtil {

    public static void loadResPic(Context context, SimpleDraweeView draweeView, int id) {
        Uri uri = Uri.parse("res://" + context.getPackageName() +
                "/" + id);
        draweeView.setImageURI(uri);
    }
}
