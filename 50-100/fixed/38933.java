@java.lang.Override
public boolean set(java.lang.String storage, java.lang.String key, java.io.Serializable value, int ttl) {
    if (com.zjicm.cache.servive.DefaultCacheServiceImpl.storageMap.containsKey(storage)) {
        com.zjicm.cache.servive.DefaultCacheServiceImpl.storageMap.get(storage).put(key, value);
    }else {
        java.util.Map<java.lang.String, java.io.Serializable> map = new java.util.HashMap<>();
        map.put(key, value);
        com.zjicm.cache.servive.DefaultCacheServiceImpl.storageMap.put(storage, map);
    }
    return true;
}