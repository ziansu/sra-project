@org.junit.Test
public void testExecutorCustomProperties() {
    final org.genepattern.server.config.GpConfig config = org.genepattern.server.config.ServerConfigurationFactory.instance();
    final org.genepattern.server.config.GpContext userContext = org.genepattern.server.config.GpContext.getContextForUser("test_user");
    org.junit.Assert.assertEquals("executor.props", "PbsBigMem", config.getGPProperty(userContext, "executor.props"));
    final java.lang.String executorId = config.getGPProperty(userContext, "executor");
    org.junit.Assert.assertEquals("executor", "DemoPbsJobRunner", executorId);
}