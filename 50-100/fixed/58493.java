private V getIfPresent(java.lang.Object key) {
    com.google.common.base.Preconditions.checkNotNull(key);
    com.google.common.cache.LocalCache.Timestamped<V> value = cachingHashMap.get(key);
    if (value == null) {
        return null;
    }else
        if (!(isExpired(value))) {
            value.updateTimestamp();
            return value.getValue();
        }else {
            alertListenerIfPresent(key, value.getValue(), com.google.common.cache.RemovalCause.EXPIRED);
            cachingHashMap.remove(key);
            return null;
        }
    
}