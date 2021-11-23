public void uploadImage() {
    try {
        android.widget.ImageView imageView = ((android.widget.ImageView) (findViewById(R.id.imageHolder)));
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) (drawable)).getBitmap();
        bitmap = scaleBitmapDown(bitmap, 1200);
        callCloudVision(bitmap);
    } catch (java.io.IOException e) {
        android.util.Log.d(com.sjsu.se195.irom.IROMazonSearchActivity.TAG, ("Image picking failed because " + (e.getMessage())));
    }
}