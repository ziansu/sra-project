@java.lang.Override
public java.util.List<com.cisco.oss.foundation.directory.entity.ServiceInstance> getAllInstances() throws com.cisco.oss.foundation.directory.exception.ServiceException {
    com.cisco.oss.foundation.directory.utils.ServiceInstanceUtils.validateManagerIsStarted(isStarted);
    java.util.List<com.cisco.oss.foundation.directory.entity.ServiceInstance> instances = null;
    java.util.List<com.cisco.oss.foundation.directory.entity.ModelServiceInstance> allInstances = getLookupService().getAllInstances();
    for (com.cisco.oss.foundation.directory.entity.ModelServiceInstance serviceInstance : allInstances) {
        instances = new java.util.ArrayList<com.cisco.oss.foundation.directory.entity.ServiceInstance>();
        instances.add(com.cisco.oss.foundation.directory.utils.ServiceInstanceUtils.toServiceInstance(serviceInstance));
    }
    if (instances == null) {
        return java.util.Collections.<com.cisco.oss.foundation.directory.entity.ServiceInstance>emptyList();
    }
    return instances;
}