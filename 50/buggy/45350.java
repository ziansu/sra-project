public android.graphics.Bitmap getBitmap(java.lang.String key) {
    android.graphics.Bitmap bitmap = getBitmapFromMemoryCache(key);
    if (bitmap == null) {
        bitmap = getBitmapFromDiskCache(key);
    }
    return bitmap;
}