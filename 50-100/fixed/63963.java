public java.util.List<java.lang.String> getInstancesByParentInstanceId(java.lang.String parentInstanceId) {
    java.util.List<java.lang.String> instances = new java.util.ArrayList<java.lang.String>();
    for (org.apache.stratos.messaging.domain.instance.Instance instance : instanceIdToInstanceMap.values()) {
        if (instance.getParentId().equals(parentInstanceId)) {
            instances.add(instance.getInstanceId());
        }
    }
    return instances;
}