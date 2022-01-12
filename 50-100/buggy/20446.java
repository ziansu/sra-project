@java.lang.Override
org.apache.ofbiz.base.util.cache.CacheLine<V> changeLine(boolean useSoftReference, long expireTimeNanos) {
    if (useSoftReference) {
        return createSoftRefCacheLine(key, getValue(), loadTimeNanos, expireTimeNanos);
    }else {
        if (differentExpireTime(expireTimeNanos)) {
            return this;
        }else {
            return createHardRefCacheLine(key, getValue(), loadTimeNanos, expireTimeNanos);
        }
    }
}