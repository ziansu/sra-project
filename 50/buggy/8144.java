@java.lang.Override
public org.ehcache.internal.store.offheap.OffHeapValueHolder<V> apply(final K k, final org.ehcache.internal.store.offheap.OffHeapValueHolder<V> present) {
    notifyInvalidation(key, getValue(present));
    return null;
}