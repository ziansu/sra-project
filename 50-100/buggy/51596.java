@java.lang.Override
public void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer response, boolean isImmediate) {
    if ((response.getBitmap()) != null) {
        try {
            bitmap = getResizedBitmap(response.getBitmap(), com.church.psalm.ScoreActivity.screenWidth, com.church.psalm.ScoreActivity.screenHeight);
            imageView.setImage(com.davemorrissey.labs.subscaleview.ImageSource.bitmap(bitmap));
            progressBarScore.setVisibility(View.GONE);
        } catch (java.lang.OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}