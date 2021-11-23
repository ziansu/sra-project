public boolean put(java.lang.String key, android.graphics.Bitmap bitmap) {
    android.graphics.Bitmap bitmapValue = get(key);
    if (bitmapValue == null) {
        if (((mImageCache) != null) && (bitmap != null))
            bitmapValue = mImageCache.put(key, bitmap);
        
    }
    return bitmapValue == bitmap;
}