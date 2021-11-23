public void addBitmapToCache(java.lang.String url, android.graphics.Bitmap bitmap) {
    if ((mCache.get(url)) != null) {
        mCache.put(url, bitmap);
    }
}