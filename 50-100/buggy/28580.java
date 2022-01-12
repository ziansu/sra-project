org.infinispan.atomic.AtomicHashMapProxy<K, V> getProxy(org.infinispan.AdvancedCache cache, java.lang.Object mapKey, org.infinispan.batch.BatchContainer batchContainer, org.infinispan.context.InvocationContextContainer icc, boolean fineGrained) {
    if ((proxy) == null) {
        synchronized(this) {
            if ((proxy) == null)
                if (fineGrained) {
                    proxy = new org.infinispan.atomic.FineGrainedAtomicHashMapProxy<K, V>(cache, mapKey, batchContainer, icc);
                }else {
                    proxy = new org.infinispan.atomic.AtomicHashMapProxy<K, V>(cache, mapKey, batchContainer, icc);
                }
            
        }
    }
    return proxy;
}