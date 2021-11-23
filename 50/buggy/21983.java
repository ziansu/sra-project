@java.lang.Override
public CompoundCachingTier.Provider create(org.ehcache.spi.service.ServiceConfiguration<org.ehcache.internal.store.tiering.CompoundCachingTier.Provider> serviceConfiguration, org.ehcache.spi.ServiceLocator serviceLocator) {
    return new org.ehcache.internal.store.tiering.CompoundCachingTier.Provider();
}