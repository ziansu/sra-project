@java.lang.Override
public boolean putIfAbsent(K key, V value, javax.cache.expiry.ExpiryPolicy expiryPolicy) {
    final long start = java.lang.System.nanoTime();
    final java.util.concurrent.Future<java.lang.Boolean> f = putIfAbsentAsyncInternal(key, value, expiryPolicy, true, false);
    try {
        boolean saved = f.get();
        if (statisticsEnabled) {
            com.hazelcast.client.cache.impl.AbstractClientCacheProxy.handleStatisticsOnPutIfAbsent(start, saved);
        }
        return saved;
    } catch (java.lang.Throwable e) {
        throw com.hazelcast.util.ExceptionUtil.rethrowAllowedTypeFirst(e, javax.cache.CacheException.class);
    }
}