public static android.graphics.Bitmap rotate(android.graphics.Bitmap bitmap, int angle) {
    if (angle == 0) {
        return bitmap;
    }
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.postRotate(angle);
    return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
}