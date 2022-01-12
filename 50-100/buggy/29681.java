public static android.graphics.Bitmap readPngFile(java.lang.String imagePath, int width, int height) throws java.io.IOException {
    java.io.File file_path = new java.io.File(imagePath);
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeStream(new java.io.FileInputStream(file_path));
    android.graphics.Bitmap resizedBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, 150, 150, false);
    return resizedBitmap;
}