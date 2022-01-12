public static void addBitmapToMemoryCache(java.lang.String key, android.graphics.Bitmap bitmap) {
    com.keepingatimeline.kat.BitmapCache.getInstance().mMemoryCache.put(key, bitmap);
}