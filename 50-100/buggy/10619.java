protected android.graphics.Bitmap setBitmapSize(int iconId, int w) {
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeResource(getContext().getResources(), iconId);
    float s = (w * 1.0F) / (bitmap.getWidth());
    bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, ((int) ((bitmap.getWidth()) * s)), ((int) ((bitmap.getHeight()) * s)), true);
    return bitmap;
}