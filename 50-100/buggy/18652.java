private void executeTestWithFailingStream() throws java.io.IOException, java.lang.InterruptedException {
    m_bundleContext.addBundleListener(this);
    registerDeploymentAdminProxy(new org.apache.ace.it.deployment.DeploymentIntegrationTest.FailingDeploymentAdmin(m_deployment, 50));
    configureTarget();
    configureServer();
    assert m_semaphore.tryAcquire(8, java.util.concurrent.TimeUnit.SECONDS) : "Timed out while waiting for deployment to abort.";
    unconfigureServer();
    unconfigureTarget();
    unregisterDeploymentAdminProxy();
    m_bundleContext.removeBundleListener(this);
}