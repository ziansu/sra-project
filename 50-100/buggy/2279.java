V putInternal(K key, V value, long expireTimeNanos) {
    java.lang.Object nulledKey = fromKey(key);
    org.apache.ofbiz.base.util.cache.CacheLine<V> oldCacheLine = memoryTable.put(nulledKey, createCacheLine(key, value, expireTimeNanos));
    V oldValue = (oldCacheLine == null) ? null : cancel(oldCacheLine);
    if (oldValue == null) {
        noteAddition(key, value);
        return null;
    }else {
        noteUpdate(key, value, oldValue);
        return oldValue;
    }
}