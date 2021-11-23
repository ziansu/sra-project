private android.graphics.Bitmap loadImage(int id) {
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeResource(context.getResources(), id);
    android.graphics.Bitmap scaled = android.graphics.Bitmap.createScaledBitmap(bitmap, IMAGE_WIDTH, IMAGE_HEIGHT, true);
    bitmap.recycle();
    return scaled;
}