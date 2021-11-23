@java.lang.Override
public org.craftercms.deployer.api.Deployment deploy(boolean waitTillDone, java.util.Map<java.lang.String, java.lang.Object> params) {
    org.craftercms.deployer.api.Deployment deployment = new org.craftercms.deployer.api.Deployment(this, params);
    pendingDeployments.add(deployment);
    java.util.concurrent.Future<?> future = deploymentExecutor.submit(new org.craftercms.deployer.impl.TargetImpl.DeploymentTask());
    if (waitTillDone) {
        org.craftercms.deployer.impl.TargetImpl.logger.debug("Waiting for deployment completion...");
        try {
            future.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            org.craftercms.deployer.impl.TargetImpl.logger.error("Unable to wait for deployment completion", e);
        }
    }
    return deployment;
}