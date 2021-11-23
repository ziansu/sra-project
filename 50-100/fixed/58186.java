public static android.graphics.Bitmap rotateBitmap(android.graphics.Bitmap bitmap, int angle) {
    if (angle != 0) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(angle);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }else {
        return bitmap;
    }
}