@java.lang.Override
public org.ehcache.internal.store.offheap.OffHeapValueHolder<V> apply(K mappedKey, org.ehcache.internal.store.offheap.OffHeapValueHolder<V> mappedValue) {
    long now = timeSource.getTimeMillis();
    if ((mappedValue == null) || (mappedValue.isExpired(now, java.util.concurrent.TimeUnit.MILLISECONDS))) {
        if (mappedValue != null) {
            eventListener.onExpiration(mappedKey, mappedValue);
        }
        mappedValue = null;
    }
    valueHolderAtomicReference.set(mappedValue);
    return null;
}