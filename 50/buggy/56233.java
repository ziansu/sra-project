private <K, V, T> org.infinispan.filter.Converter<K, V, T> wrap(org.radargun.service.Converter<K, V, T> converter) {
    return new org.radargun.service.InfinispanIterable.ConverterWrapper<K, V, T>(converter);
}