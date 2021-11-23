@java.lang.Override
public <X> void entryRemoved(X key) {
    org.wso2.carbon.caching.impl.CacheEntry<K, V> value = distributedCache.get(key);
    if (value != null) {
        notifyCacheEntryRemoved(value.getKey(), value.getValue());
    }
    localCache.remove(((K) (key)));
}