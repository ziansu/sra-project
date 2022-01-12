@org.junit.Test(expected = java.lang.UnsupportedOperationException.class)
public void testEmptyCommandLine() {
    final org.genepattern.drm.DrmJobSubmission drmJob = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).commandLine(new java.lang.String[0]).build();
    org.junit.Assert.assertEquals("Expecting emtpy list", 0, drmJob.getCommandLine().size());
    drmJob.getCommandLine().add("-P");
}