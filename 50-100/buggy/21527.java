private static android.graphics.Bitmap rotateBitmapInt(android.graphics.Bitmap bitmap, int degrees) {
    if (degrees > 0) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(degrees);
        android.graphics.Bitmap newBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmap.recycle();
        return newBitmap;
    }else {
        return bitmap;
    }
}