public static com.hazelcast.instance.HazelcastInstanceImpl getHazelcastInstanceImpl(com.hazelcast.core.HazelcastInstance hz) {
    com.hazelcast.instance.HazelcastInstanceImpl impl = null;
    if (hz instanceof com.hazelcast.instance.HazelcastInstanceProxy) {
        return com.hazelcast.simulator.utils.ReflectionUtils.getObjectFromField(hz, "original");
    }else
        if (hz instanceof com.hazelcast.instance.HazelcastInstanceImpl) {
            impl = ((com.hazelcast.instance.HazelcastInstanceImpl) (hz));
        }
    
    return impl;
}