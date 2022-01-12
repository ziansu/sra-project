public static android.graphics.Bitmap rotateBitmapByDegree(android.graphics.Bitmap bitmap, int degree) {
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.postRotate(degree);
    android.graphics.Bitmap newBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    if ((bitmap != null) && (!(bitmap.isRecycled()))) {
        bitmap.recycle();
    }
    return newBitmap;
}