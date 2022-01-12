protected <K, V> org.infinispan.filter.KeyValueFilter<K, V> wrap(org.radargun.service.Filter<K, V> filter) {
    if (filter == null) {
        return org.radargun.filters.AllFilter.INSTANCE;
    }else {
        return new org.radargun.service.InfinispanIterable.KeyValueFilterWrapper<K, V>(filter);
    }
}