public android.graphics.Bitmap rotate(android.graphics.Bitmap bmp) {
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.postRotate(90);
    android.graphics.Bitmap b1 = android.graphics.Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), bmp.getHeight(), matrix, true);
    return b1;
}