@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    if (bitmap != null)
        this.photo.setImageBitmap(bitmap);
    
}