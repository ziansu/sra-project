@org.junit.Test
public void testCustomMemory() {
    final org.genepattern.server.config.GpServerProperties serverProperties = new org.genepattern.server.config.GpServerProperties.Builder().addCustomProperty(JobRunner.PROP_MEMORY, "8g").build();
    final org.genepattern.server.config.GpConfig gpConfig = new org.genepattern.server.config.GpConfig.Builder().serverProperties(serverProperties).build();
    org.genepattern.drm.DrmJobSubmission drmJobSubmission = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).gpConfig(gpConfig).build();
    org.junit.Assert.assertEquals("set memory in config", org.genepattern.drm.Memory.fromString("8g"), drmJobSubmission.getMemory());
}