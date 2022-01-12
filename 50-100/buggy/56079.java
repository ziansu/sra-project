@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    if (((imageViewReference) != null) && (bitmap != null)) {
        final android.widget.ImageView imageView = imageViewReference.get();
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}