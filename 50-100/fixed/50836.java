public synchronized org.apache.stratos.messaging.domain.topology.locking.TopologyLock getTopologyLockForService(java.lang.String serviceName, boolean forceCreationIfNotFound) {
    org.apache.stratos.messaging.domain.topology.locking.TopologyLock topologyLock = serviceNameToTopologyLockMap.get(serviceName);
    if ((topologyLock == null) && forceCreationIfNotFound) {
        topologyLock = new org.apache.stratos.messaging.domain.topology.locking.TopologyLock();
        serviceNameToTopologyLockMap.put(serviceName, topologyLock);
    }
    return topologyLock;
}