@org.junit.Test
public void testInitFromGpConfig_queue_virtualQueue_only() throws java.lang.Exception {
    final org.genepattern.server.config.GpConfig gpConfig = new org.genepattern.server.config.GpConfig.Builder().addProperty(JobRunner.PROP_VIRTUAL_QUEUE, "my_virtual_queue").build();
    final org.genepattern.drm.DrmJobSubmission jobSubmission = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).gpConfig(gpConfig).build();
    assertEquals("getQueue", null, jobSubmission.getQueue());
    assertEquals("getQueueId", "my_virtual_queue", jobSubmission.getQueueId());
}