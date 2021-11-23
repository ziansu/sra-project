public static org.apache.stratos.messaging.domain.topology.Topology retrieveTopology() {
    java.lang.Object dataObj = org.apache.stratos.cloud.controller.registry.RegistryManager.getInstance().read(CloudControllerConstants.TOPOLOGY_RESOURCE);
    if (dataObj != null) {
        try {
            if (dataObj instanceof org.apache.stratos.messaging.domain.topology.Topology) {
                return ((org.apache.stratos.messaging.domain.topology.Topology) (dataObj));
            }else {
                return null;
            }
        } catch (java.lang.Exception e) {
            java.lang.String msg = "Unable to retrieve data from Registry. Hence, any historical data will not get reflected.";
            org.apache.stratos.cloud.controller.util.CloudControllerUtil.log.warn(msg, e);
        }
    }
    return null;
}