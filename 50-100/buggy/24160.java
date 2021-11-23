private void recordUriCommand(java.net.URI uri, java.lang.String command) {
    java.io.Writer writer;
    try {
        writer = new java.io.FileWriter(this.redeployDataset.toFile(), true);
        org.eclipse.virgo.kernel.deployer.core.internal.recovery.DeployerRecoveryLog.recordUriCommand(writer, uri, command);
        writer.close();
    } catch (java.io.IOException e) {
        throw new org.eclipse.virgo.nano.deployer.api.core.FatalDeploymentException("Failed to record (un)deployment", e);
    }
}