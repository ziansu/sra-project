public static android.graphics.Bitmap rotateImage(android.graphics.Bitmap src, float degree) {
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.postRotate(degree);
    android.graphics.Bitmap bmp = android.graphics.Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);
    return bmp;
}