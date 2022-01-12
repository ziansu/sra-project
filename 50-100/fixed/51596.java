@java.lang.Override
public void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer response, boolean isImmediate) {
    if ((response.getBitmap()) != null) {
        try {
            imageView.setImage(com.davemorrissey.labs.subscaleview.ImageSource.bitmap(response.getBitmap()));
            progressBarScore.setVisibility(View.GONE);
        } catch (java.lang.OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}