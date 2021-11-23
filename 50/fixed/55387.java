public android.graphics.Bitmap getFromCache(java.lang.String filename) {
    java.io.File path = new java.io.File(directory, filename);
    return android.graphics.BitmapFactory.decodeFile(path.getAbsolutePath());
}