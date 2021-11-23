@org.junit.Test
public void testInitFromGpConfig_cpuCount() throws java.lang.Exception {
    final org.genepattern.server.config.GpConfig gpConfig = new org.genepattern.server.config.GpConfig.Builder().addProperty(JobRunner.PROP_CPU_COUNT, "2").build();
    final org.genepattern.drm.DrmJobSubmission jobSubmission = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).gpConfig(gpConfig).build();
    org.junit.Assert.assertEquals("job.cpuCount", ((java.lang.Integer) (2)), jobSubmission.getCpuCount());
}