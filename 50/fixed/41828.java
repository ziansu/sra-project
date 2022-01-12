public boolean isStarted() {
    for (io.cattle.platform.servicediscovery.deployment.DeploymentUnitInstance instance : getDeploymentUnitInstances()) {
        if (!(instance.isStarted())) {
            return false;
        }
    }
    return true;
}