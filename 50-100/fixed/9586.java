@org.junit.Test
public void testCustomWalltime() throws java.lang.Exception {
    final org.genepattern.server.config.GpServerProperties serverProperties = new org.genepattern.server.config.GpServerProperties.Builder().addCustomProperty(JobRunner.PROP_WALLTIME, "7-00:00:00").build();
    final org.genepattern.server.config.GpConfig gpConfig = new org.genepattern.server.config.GpConfig.Builder().serverProperties(serverProperties).build();
    org.genepattern.drm.DrmJobSubmission drmJobSubmission = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).gpConfig(gpConfig).build();
    assertEquals("set walltime in config", org.genepattern.drm.Walltime.fromString("7-00:00:00"), drmJobSubmission.getWalltime());
}