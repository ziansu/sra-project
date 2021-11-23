android.graphics.Bitmap readFile(java.io.File file) {
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeFile(file.getPath());
    return bitmap;
}