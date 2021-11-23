public void startTriggers(boolean newInstance) {
    if (((owner) == null) && (org.jenkinsci.plugins.workflow.job.properties.PipelineTriggersJobProperty.LOGGER.isLoggable(java.util.logging.Level.FINE))) {
        org.jenkinsci.plugins.workflow.job.properties.PipelineTriggersJobProperty.LOGGER.log(java.util.logging.Level.FINE, "Cannot start triggers. Owner of the JobProperty has not been assigned yet", new java.lang.IllegalStateException("JobProperty owner is null"));
    }
    for (hudson.triggers.Trigger trigger : triggers) {
        try {
            trigger.start(owner, newInstance);
        } catch (java.lang.Exception ex) {
            org.jenkinsci.plugins.workflow.job.properties.PipelineTriggersJobProperty.LOGGER.log(java.util.logging.Level.SEVERE, "Can't start trigger.", ex);
        }
    }
}