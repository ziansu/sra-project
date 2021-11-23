@java.lang.Override
public org.apache.twill.internal.ProcessController<org.apache.twill.internal.yarn.YarnApplicationReport> submit(org.apache.twill.internal.yarn.YarnLaunchContext context) {
    org.apache.hadoop.yarn.api.records.ContainerLaunchContext launchContext = context.getLaunchContext();
    appSubmissionContext.setAMContainerSpec(launchContext);
    appSubmissionContext.setResource(capability);
    appSubmissionContext.setMaxAppAttempts(2);
    try {
        yarnClient.submitApplication(appSubmissionContext);
        return new org.apache.twill.internal.yarn.Hadoop21YarnAppClient.ProcessControllerImpl(yarnClient, appId);
    } catch (java.lang.Exception e) {
        org.apache.twill.internal.yarn.Hadoop21YarnAppClient.LOG.error("Failed to submit application {}", appId, e);
        throw com.google.common.base.Throwables.propagate(e);
    }
}