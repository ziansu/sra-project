private void bootstrapHazelcast() {
    com.hazelcast.config.Config config = buildConfiguration();
    java.lang.ClassLoader tccl = java.lang.Thread.currentThread().getContextClassLoader();
    java.lang.Thread.currentThread().setContextClassLoader(com.hazelcast.core.Hazelcast.class.getClassLoader());
    theInstance = com.hazelcast.core.Hazelcast.newHazelcastInstance(config);
    theInstance.getCluster().getLocalMember().setStringAttribute(fish.payara.nucleus.hazelcast.HazelcastCore.INSTANCE_ATTRIBUTE, context.getInstanceName());
    hazelcastCachingProvider = com.hazelcast.cache.impl.HazelcastServerCachingProvider.createCachingProvider(theInstance);
    java.lang.Thread.currentThread().setContextClassLoader(tccl);
}