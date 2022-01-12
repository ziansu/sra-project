@java.lang.Override
org.apache.ofbiz.base.util.cache.CacheLine<V> changeLine(boolean useSoftReference, long expireTimeNanos) {
    if (useSoftReference) {
        if (differentExpireTime(expireTimeNanos)) {
            return this;
        }
        return createSoftRefCacheLine(key, getValue(), loadTimeNanos, expireTimeNanos);
    }
    return createHardRefCacheLine(key, getValue(), loadTimeNanos, expireTimeNanos);
}