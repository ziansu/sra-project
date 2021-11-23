private org.apache.ofbiz.base.util.cache.CacheLine<V> createCacheLine(K key, V value, long expireTimeNanos) {
    long loadTimeNanos = (expireTimeNanos > 0) ? java.lang.System.nanoTime() : 0;
    if (useSoftReference) {
        return createSoftRefCacheLine(key, value, loadTimeNanos, expireTimeNanos);
    }
    return createHardRefCacheLine(key, value, loadTimeNanos, expireTimeNanos);
}