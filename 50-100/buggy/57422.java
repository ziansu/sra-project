@java.lang.Override
org.apache.ofbiz.base.util.cache.CacheLine<V> changeLine(boolean useSoftReference, long expireTimeNanos) {
    if (useSoftReference) {
        if (differentExpireTime(expireTimeNanos)) {
            return this;
        }else {
            return createSoftRefCacheLine(key, getValue(), loadTimeNanos, expireTimeNanos);
        }
    }else {
        return createHardRefCacheLine(key, getValue(), loadTimeNanos, expireTimeNanos);
    }
}