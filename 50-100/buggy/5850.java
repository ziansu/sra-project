public void rotateImage(com.isseiaoki.simplecropview.CropImageView.RotateDegrees degrees) {
    int angle = degrees.getValue();
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.postRotate(angle);
    android.graphics.Bitmap source = getBitmap();
    android.graphics.Bitmap rotated = android.graphics.Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix, true);
    setImageBitmap(rotated);
}