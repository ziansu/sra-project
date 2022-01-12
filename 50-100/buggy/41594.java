@java.lang.Override
public void restart() throws java.io.IOException, java.lang.InterruptedException {
    jenkins.model.Jenkins h = jenkins.model.Jenkins.getInstanceOrNull();
    try {
        if ((jenkins) != null) {
            jenkins.cleanUp();
        }
    } catch (java.lang.Exception e) {
        hudson.lifecycle.SolarisSMFLifecycle.LOGGER.log(java.util.logging.Level.SEVERE, "Failed to clean up. Restart will continue.", e);
    }
    java.lang.System.exit(0);
}