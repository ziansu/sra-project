@java.lang.Override
<K, V> org.ehcache.Ehcache<K, V> createNewEhcache(final java.lang.String alias, final org.ehcache.config.CacheConfiguration<K, V> config, final java.lang.Class<K> keyType, final java.lang.Class<V> valueType) {
    final org.ehcache.Ehcache<K, V> ehcache = super.createNewEhcache(alias, config, keyType, valueType);
    return org.mockito.Mockito.spy(ehcache);
}