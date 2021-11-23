public static java.lang.String getHealthCheckURLFromName(java.lang.String healthCheckName) {
    java.lang.String healthCheckURL;
    org.apache.stratos.gce.extension.util.HttpHealthCheckList healthCheckList;
    healthCheckList = org.apache.stratos.gce.extension.util.GCEOperations.getHealthCheckList();
    for (org.apache.stratos.gce.extension.util.HttpHealthCheck httpHealthCheck : healthCheckList.getItems()) {
        if (httpHealthCheck.getName().equals(healthCheckName)) {
            healthCheckURL = httpHealthCheck.getSelfLink();
            return healthCheckURL;
        }
    }
    return null;
}