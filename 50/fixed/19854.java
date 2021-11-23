android.graphics.Bitmap readFile(java.io.File file) {
    return android.graphics.BitmapFactory.decodeFile(file.getPath());
}