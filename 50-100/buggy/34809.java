public static android.graphics.Bitmap rotateBitmap(android.graphics.Bitmap bitmap, int angle) {
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.postRotate(angle);
    android.graphics.Bitmap resizedBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    bitmap.recycle();
    return resizedBitmap;
}