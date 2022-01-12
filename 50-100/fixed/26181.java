public void buildHashConfiguration(org.infinispan.configuration.cache.HashConfigurationBuilder builder, org.infinispan.configuration.cache.CacheMode mode, boolean topologyAware) {
    if (mode.isClustered()) {
        if (mode.isDistributed()) {
            builder.consistentHashFactory(this.createConsistentHashFactory(topologyAware));
        }else {
            builder.consistentHashFactory(new org.infinispan.distribution.ch.ReplicatedConsistentHashFactory());
        }
    }
}