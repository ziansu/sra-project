@java.lang.Override
public void doWithLockNoResult() {
    if (!(sdSvc.isActiveService(service))) {
        return ;
    }
    java.util.List<io.cattle.platform.servicediscovery.deployment.impl.DeploymentUnit> units = unitInstanceFactory.collectDeploymentUnits(services, new io.cattle.platform.servicediscovery.deployment.impl.DeploymentManagerImpl.DeploymentServiceContext());
    boolean needToReconcile = needToReconcile(services, units);
    if (!needToReconcile) {
        return ;
    }
    activateServices(service, services);
    activateDeploymentUnits(services, units);
}