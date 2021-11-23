public static boolean add(java.lang.Object o) throws java.io.IOException {
    java.io.File cacheFile = new java.io.File(((com.xushuzhan.quiltnews.cache.CacheFileManger.CACHE_DIR) + (o.getClass().getSimpleName())));
    cacheFile.deleteOnExit();
    return cacheFile.createNewFile();
}