private void cleanUp(java.io.File tmpProjectFolder) {
    if (tmpProjectFolder == null) {
        org.tuberlin.de.deployment.DeploymentImplementation.LOG.debug("Nothing to clean up as tmpProjectFolder is null");
        return ;
    }
    org.tuberlin.de.deployment.DeploymentImplementation.LOG.debug(("Deleting temporary project folder for " + (tmpProjectFolder.toString())));
    try {
        org.tuberlin.de.deployment.util.FileUtils.removeRecursive(tmpProjectFolder.toPath());
    } catch (java.io.IOException e) {
        org.tuberlin.de.deployment.DeploymentImplementation.LOG.error(("Could not remove temporary folder " + (tmpProjectFolder.toString())), e);
        e.printStackTrace();
    }
}