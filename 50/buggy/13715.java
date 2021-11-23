public static void setBitmapToMemoryCache(java.lang.String key, android.graphics.Bitmap bitmap) {
    if ((nigelhenshaw.com.cameraintenttutorial.CamaraIntentActivity.getBitmapFromMemoryCache(key)) == null) {
        nigelhenshaw.com.cameraintenttutorial.CamaraIntentActivity.mMemoryCache.put(key, bitmap);
    }
}