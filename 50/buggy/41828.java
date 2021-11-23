public boolean isStarted() {
    for (io.cattle.platform.servicediscovery.deployment.DeploymentUnitInstance instance : getDeploymentUnitInstances()) {
        if ((!(instance.isStarted())) && (instance.isRestartAlways())) {
            return false;
        }
    }
    return true;
}