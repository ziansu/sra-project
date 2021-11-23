@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    if (bitmap != null) {
        imagePreview.setImageBitmap(bitmap);
    }
}