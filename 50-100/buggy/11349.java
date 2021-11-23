@org.junit.Test(expected = java.lang.UnsupportedOperationException.class)
public void testNullCommandLine() {
    final org.genepattern.drm.DrmJobSubmission drmJob = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).build();
    org.junit.Assert.assertEquals("Expecting emtpy list", 0, drmJob.getCommandLine().size());
    drmJob.getCommandLine().add("-P");
}