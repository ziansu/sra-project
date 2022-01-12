private org.ehcache.internal.store.offheap.OffHeapValueHolder<V> newTransferValueHolder(org.ehcache.internal.store.offheap.ValueHolder<V> valueHolder) {
    return new org.ehcache.internal.store.offheap.OffHeapValueHolder<V>(valueHolder.getId(), valueHolder.value(), valueHolder.creationTime(OffHeapValueHolder.TIME_UNIT), valueHolder.expirationTime(OffHeapValueHolder.TIME_UNIT), valueHolder.lastAccessTime(OffHeapValueHolder.TIME_UNIT), valueHolder.hits(), null);
}