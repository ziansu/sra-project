org.infinispan.atomic.AtomicHashMapProxy<K, V> getProxy(org.infinispan.AdvancedCache cache, java.lang.Object mapKey, boolean fineGrained) {
    if ((proxy) == null) {
        synchronized(this) {
            if ((proxy) == null)
                if (fineGrained) {
                    proxy = new org.infinispan.atomic.FineGrainedAtomicHashMapProxy<K, V>(cache, mapKey);
                }else {
                    proxy = new org.infinispan.atomic.AtomicHashMapProxy<K, V>(cache, mapKey);
                }
            
        }
    }
    return proxy;
}