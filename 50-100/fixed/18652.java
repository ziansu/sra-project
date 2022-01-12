private void executeTestWithFailingStream() throws java.io.IOException, java.lang.InterruptedException {
    m_bundleContext.addBundleListener(this);
    registerDeploymentAdminProxy(new org.apache.ace.it.deployment.DeploymentIntegrationTest.FailingDeploymentAdmin(m_deployment, 50));
    try {
        configureTarget();
        configureServer();
        assertTrue("Timed out while waiting for deployment to abort.", m_semaphore.tryAcquire(8, java.util.concurrent.TimeUnit.SECONDS));
        unconfigureServer();
        unconfigureTarget();
    } finally {
        unregisterDeploymentAdminProxy();
        m_bundleContext.removeBundleListener(this);
    }
}