public android.graphics.Bitmap rotate(android.graphics.Bitmap bmp) {
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.postRotate(90);
    android.graphics.Bitmap b1 = android.graphics.Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), bmp.getHeight(), matrix, true);
    android.graphics.Bitmap image = android.graphics.Bitmap.createScaledBitmap(b1, glView.getWidth(), glView.getHeight(), true);
    return image;
}