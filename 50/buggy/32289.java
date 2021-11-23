public static void addBitmapToMemoryCache(com.esaych.calc.utils.TextBookLoc key, android.graphics.Bitmap bitmap) {
    if ((com.esaych.calc.utils.ImageCache.imageCache.get(key)) == null) {
        com.esaych.calc.utils.ImageCache.imageCache.put(key, bitmap);
    }
}