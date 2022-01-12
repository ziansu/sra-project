@java.lang.Override
public int compare(org.ehcache.impl.internal.store.heap.ValueHolder<?> t, org.ehcache.impl.internal.store.heap.ValueHolder<?> u) {
    if (t instanceof org.ehcache.impl.internal.store.heap.OnHeapStore.Fault) {
        return -1;
    }else
        if (u instanceof org.ehcache.impl.internal.store.heap.OnHeapStore.Fault) {
            return 1;
        }else {
            return java.lang.Long.signum(((u.lastAccessTime(java.util.concurrent.TimeUnit.NANOSECONDS)) - (t.lastAccessTime(java.util.concurrent.TimeUnit.NANOSECONDS))));
        }
    
}