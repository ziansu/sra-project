@java.lang.Override
public void removeAssociation(org.hibernate.ogm.model.key.spi.AssociationKey key, org.hibernate.ogm.dialect.spi.AssociationContext associationContext) {
    org.infinispan.Cache<AK, java.util.Map<org.hibernate.ogm.model.key.spi.RowKey, java.util.Map<java.lang.String, java.lang.Object>>> cache = getCacheManager().getAssociationCache(key.getMetadata());
    AK cacheKey = getKeyProvider().getAssociationCacheKey(key);
    java.util.Map<org.hibernate.ogm.model.key.spi.RowKey, java.util.Map<java.lang.String, java.lang.Object>> atomicMap = cache.get(cacheKey);
    if (atomicMap != null) {
        atomicMap.clear();
    }
    org.infinispan.atomic.AtomicMapLookup.removeAtomicMap(cache, cacheKey);
}