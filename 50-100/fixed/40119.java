@org.junit.Test
public void testCustomJobConfigParams() {
    final org.genepattern.server.config.GpConfig gpConfig = org.genepattern.server.config.ServerConfigurationFactory.instance();
    final org.genepattern.server.config.GpContext userContext = org.genepattern.server.config.GpContext.getContextForUser("test_user");
    assertEquals("executor.props for test_user", "PbsBigMem", gpConfig.getGPProperty(userContext, "executor.props"));
    org.genepattern.server.job.input.configparam.JobConfigParams jobConfigParams = org.genepattern.server.job.input.configparam.JobConfigParams.initJobConfigParams(gpConfig, userContext);
    assertNotNull("initJobConfigParams was null", jobConfigParams);
}