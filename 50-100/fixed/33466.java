@org.junit.Test
public void testExecutorCustomProperties() {
    final org.genepattern.server.config.GpConfig config = org.genepattern.server.config.ServerConfigurationFactory.instance();
    final org.genepattern.server.config.GpContext userContext = org.genepattern.server.config.GpContext.getContextForUser("test_user");
    assertEquals("executor.props", "PbsBigMem", config.getGPProperty(userContext, "executor.props"));
    final java.lang.String executorId = config.getGPProperty(userContext, "executor");
    assertEquals("executor", "DemoPbsJobRunner", executorId);
}