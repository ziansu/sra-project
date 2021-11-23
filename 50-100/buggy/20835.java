@java.lang.Override
public com.cisco.oss.foundation.directory.entity.ServiceInstance vote(java.util.List<com.cisco.oss.foundation.directory.entity.ServiceInstance> instances) {
    if ((instances == null) || (instances.isEmpty())) {
        throw new java.lang.IllegalArgumentException("input instances are null or empty");
    }
    int i = index.getAndIncrement();
    int pos = i % (instances.size());
    com.cisco.oss.foundation.directory.entity.ServiceInstance instance = instances.get(pos);
    return instance;
}