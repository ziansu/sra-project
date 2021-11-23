@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    android.widget.ImageView imageView = mImageViewRef.get();
    if ((imageView != null) && (bitmap != null)) {
        android.graphics.drawable.Drawable currentDrawable = imageView.getDrawable();
        if ((currentDrawable != null) && (currentDrawable instanceof com.iolab.sightlocator.AsyncDrawable)) {
            if ((((com.iolab.sightlocator.AsyncDrawable) (currentDrawable)).getAsyncTask()) == (this)) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }
}