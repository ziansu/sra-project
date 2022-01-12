@org.junit.Test
public void testLogfilenameRelative() {
    org.genepattern.drm.DrmJobSubmission job = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).logFilename(".lsf.out").build();
    org.junit.Assert.assertEquals(new java.io.File(workingDir, ".lsf.out").getAbsolutePath(), job.getRelativeFile(job.getLogFile()).getAbsolutePath());
}