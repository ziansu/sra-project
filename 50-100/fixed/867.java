public static void saveBitmapFile(java.lang.String path, android.graphics.Bitmap bitmap) {
    com.yugegong.reminder.Utils.deleteFile(path);
    if (bitmap == null)
        return ;
    
    try {
        java.io.FileOutputStream outputStream = new java.io.FileOutputStream(path);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
        outputStream.flush();
        outputStream.close();
        android.util.Log.d("saveBitmapFile", ("new size: " + (new java.io.File(path).length())));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}