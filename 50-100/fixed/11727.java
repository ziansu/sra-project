@java.lang.Override
public V put(K key, V value) {
    com.google.common.base.Preconditions.checkNotNull(key);
    com.google.common.base.Preconditions.checkNotNull(value);
    com.google.common.cache.LocalCache.Timestamped<V> oldValue = cachingHashMap.put(key, new com.google.common.cache.LocalCache.Timestamped<V>(value, ticker));
    if (oldValue == null) {
        return null;
    }
    alertListenerIfPresent(key, oldValue.getValue(), com.google.common.cache.RemovalCause.REPLACED);
    return oldValue.getValue();
}