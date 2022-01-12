public static java.lang.String getInstanceURLFromId(java.lang.String instanceId) {
    java.lang.String instanceURL = null;
    java.lang.String zoneName = org.apache.stratos.gce.extension.util.GCEOperations.getZoneNameFromInstanceId(instanceId);
    org.apache.stratos.gce.extension.util.InstanceList instanceList = org.apache.stratos.gce.extension.util.GCEOperations.getInstanceList(zoneName);
    for (org.apache.stratos.gce.extension.util.Instance instance : instanceList.getItems()) {
        java.lang.String instanceIdInIaaS = (zoneName + "/") + (instance.getName());
        if (instanceIdInIaaS.equals(instanceId)) {
            instanceURL = instance.getSelfLink();
            return instanceURL;
        }
    }
    return instanceURL;
}