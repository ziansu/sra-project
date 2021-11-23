@org.junit.Test
public void testInitFromGpConfig_walltime() throws java.lang.Exception {
    final org.genepattern.server.config.GpConfig gpConfig = new org.genepattern.server.config.GpConfig.Builder().addProperty(JobRunner.PROP_WALLTIME, "7-00:00:00").build();
    final org.genepattern.drm.DrmJobSubmission jobSubmission = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).gpConfig(gpConfig).build();
    assertEquals("job.walltime", org.genepattern.drm.Walltime.fromString("7-00:00:00"), jobSubmission.getWalltime());
}