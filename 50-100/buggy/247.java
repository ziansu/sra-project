public static java.util.Collection<java.lang.Long> getOrderIds(java.util.Map<java.lang.Long, java.util.List<org.apache.ignite.internal.processors.cache.CacheEntryImpl<java.lang.Long, org.apache.ignite.tests.pojos.ProductOrder>>> orders) {
    java.util.List<java.lang.Long> ids = new java.util.LinkedList<>();
    for (java.lang.Long key : orders.keySet()) {
        for (org.apache.ignite.internal.processors.cache.CacheEntryImpl<java.lang.Long, org.apache.ignite.tests.pojos.ProductOrder> entry : orders.get(key))
            ids.add(entry.getKey());
        
    }
    return ids;
}