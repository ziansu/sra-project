@org.junit.Test
public void testGetGpConfigProperty() {
    final org.genepattern.drm.DrmJobSubmission drmJob = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).commandLine(org.genepattern.drm.TestDrmJobSubmission.cmdLineArgs).build();
    final org.genepattern.server.config.GpConfig config = org.genepattern.server.config.ServerConfigurationFactory.instance();
    final org.genepattern.server.config.GpContext userContext = org.genepattern.server.config.GpContext.getContextForUser("test_user");
    org.genepattern.server.config.Value javaXmx = config.getValue(userContext, "job.javaXmx");
    assertEquals("job.javaXmx", "2gb", drmJob.getProperty("job.javaXmx"));
}