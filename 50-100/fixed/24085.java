@java.lang.Override
public <T extends java.io.Serializable> T get(java.lang.String storage, java.lang.String key) {
    if (!(com.zjicm.cache.servive.DefaultCacheServiceImpl.storageMap.containsKey(storage)))
        return null;
    
    java.util.Map<java.lang.String, java.io.Serializable> map = com.zjicm.cache.servive.DefaultCacheServiceImpl.storageMap.get(storage);
    if (org.apache.commons.collections.MapUtils.isEmpty(map))
        return null;
    
    return ((T) (map.get(key)));
}