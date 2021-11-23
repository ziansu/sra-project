@java.lang.Override
public void jobStatusChanged(com.thoughtworks.go.domain.JobInstance job) {
    if (job.getState().isCompleted()) {
        try {
            com.thoughtworks.go.domain.JobIdentifier identifier = job.getIdentifier();
            consoleService.moveConsoleArtifacts(identifier);
            consoleService.appendToConsoleLog(identifier, java.lang.String.format("[%s] %s %s", GoConstants.PRODUCT_NAME, "Job Completed", identifier.buildLocatorForDisplay()));
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}