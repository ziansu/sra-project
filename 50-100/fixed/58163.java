private void bootstrapHazelcast() {
    com.hazelcast.config.Config config = buildConfiguration();
    theInstance = com.hazelcast.core.Hazelcast.newHazelcastInstance(config);
    theInstance.getCluster().getLocalMember().setStringAttribute(fish.payara.nucleus.hazelcast.HazelcastCore.INSTANCE_ATTRIBUTE, context.getInstanceName());
    hazelcastCachingProvider = com.hazelcast.cache.impl.HazelcastServerCachingProvider.createCachingProvider(theInstance);
}