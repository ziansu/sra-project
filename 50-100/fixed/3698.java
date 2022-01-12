public boolean isHealthCheckExists(java.lang.String healthCheckName) {
    try {
        org.apache.stratos.gce.extension.HttpHealthCheckList httpHealthCheckList = org.apache.stratos.gce.extension.GCEOperations.compute.httpHealthChecks().list(org.apache.stratos.gce.extension.GCEOperations.PROJECT_ID).execute();
        if ((httpHealthCheckList.size()) == 0) {
            return false;
        }
        for (org.apache.stratos.gce.extension.HttpHealthCheck httpHealthCheck : httpHealthCheckList.getItems()) {
            if (httpHealthCheck.getName().equals(healthCheckName)) {
                return true;
            }
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return false;
}