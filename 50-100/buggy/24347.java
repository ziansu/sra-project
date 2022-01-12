public <T> T getFromListCache(java.lang.Object key, com.jfinal.plugin.ehcache.IDataLoader dataloader) {
    java.util.List<java.lang.String> inCacheKeys = com.jfinal.plugin.ehcache.CacheKit.get(io.jpress.model.CACHE_NAME, "cachekeys");
    java.util.List<java.lang.String> cacheKeyList = new java.util.ArrayList<java.lang.String>();
    if (inCacheKeys != null) {
        cacheKeyList.addAll(inCacheKeys);
    }
    cacheKeyList.add(key.toString());
    com.jfinal.plugin.ehcache.CacheKit.put(io.jpress.model.CACHE_NAME, "cachekeys", cacheKeyList);
    return com.jfinal.plugin.ehcache.CacheKit.get("content_list", key, dataloader);
}