private android.graphics.Bitmap getBitmapFromNetwork(java.lang.String source, com.handlerexploit.prime.utils.ImageManager.OnProcessListener listener) {
    java.lang.String key = com.handlerexploit.prime.utils.ImageManager.getKey(source);
    byte[] byteArray = com.handlerexploit.prime.utils.ImageManager.copyURLToByteArray(source);
    if (byteArray != null) {
        android.graphics.Bitmap bitmap = com.handlerexploit.prime.utils.ImageManager.decodeByteArray(byteArray, listener);
        if (bitmap != null) {
            com.handlerexploit.prime.utils.ImageManager.copyBitmapToDiskLruCache(key, bitmap, mDiskLruCache);
            mLruCache.put(key, bitmap);
            return bitmap;
        }
    }
    return null;
}