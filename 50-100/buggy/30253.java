@org.junit.Test
public void testInitFromGpConfig_queue() throws java.lang.Exception {
    final org.genepattern.server.config.GpConfig gpConfig = new org.genepattern.server.config.GpConfig.Builder().addProperty(JobRunner.PROP_QUEUE, "my_queue").build();
    final org.genepattern.drm.DrmJobSubmission jobSubmission = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).gpConfig(gpConfig).build();
    org.junit.Assert.assertEquals("getQueue", "my_queue", jobSubmission.getQueue());
    org.junit.Assert.assertEquals("getQueueId", "my_queue", jobSubmission.getQueueId());
}