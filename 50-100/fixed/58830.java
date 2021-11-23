@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.Object... params) {
    android.graphics.Bitmap bitmap = null;
    if (isFile) {
        java.io.File file = new java.io.File(stringpath);
        if (file.exists()) {
            bitmap = android.graphics.BitmapFactory.decodeFile(file.getAbsolutePath());
        }
    }
    return bitmap;
}