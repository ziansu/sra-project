public android.graphics.Bitmap bitmap(int maxSize) {
    android.graphics.Bitmap bitmap = cachedBitmap.get();
    if (bitmap == null) {
        java.lang.String path = path();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeFile(path, options);
        options.inSampleSize = calculateInSampleSize(options, maxSize, maxSize);
        options.inJustDecodeBounds = false;
        bitmap = android.graphics.BitmapFactory.decodeFile(path, options);
        cachedBitmap = new java.lang.ref.SoftReference(bitmap);
    }
    return bitmap;
}