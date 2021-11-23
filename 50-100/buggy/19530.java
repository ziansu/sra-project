public static boolean add(java.lang.Object o) throws java.io.IOException {
    android.util.Log.d(com.xushuzhan.quiltnews.cache.CacheFileManger.TAG, ("add: " + (o.getClass().getSimpleName())));
    java.io.File cacheFile = new java.io.File(((com.xushuzhan.quiltnews.cache.CacheFileManger.CACHE_DIR) + (o.getClass().getSimpleName())));
    android.util.Log.d(com.xushuzhan.quiltnews.cache.CacheFileManger.TAG, ("add: " + (cacheFile.exists())));
    cacheFile.deleteOnExit();
    return cacheFile.createNewFile();
}