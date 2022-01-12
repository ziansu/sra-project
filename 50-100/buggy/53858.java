protected static void writeToCache(java.lang.Object o) throws java.io.IOException {
    java.io.File file = new java.io.File(((com.xushuzhan.quiltnews.cache.CacheFileManger.CACHE_DIR) + (o.getClass().getSimpleName())));
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String in = gson.toJson(o);
    java.io.Writer out = new java.io.FileWriter(file);
    out.write(in);
    out.close();
    android.util.Log.d(com.xushuzhan.quiltnews.cache.CacheFileManger.TAG, ("writeToCache: " + in));
}