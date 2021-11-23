@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap result) {
    android.widget.ImageView imageView = mReference.get();
    if ((imageView != null) && (result != null)) {
        if ((imageView.getTag()) == (this)) {
            imageView.setImageBitmap(result);
            org.wordpress.mediapicker.MediaUtils.fadeInImage(imageView, result);
        }
    }
}