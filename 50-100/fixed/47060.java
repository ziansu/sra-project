@org.junit.Test
public void testLogfileAbsolute() throws java.io.IOException {
    java.io.File allLogFiles = temp.newFolder("allLogFiles");
    java.io.File absLogFile = new java.io.File(allLogFiles, ((org.genepattern.drm.TestDrmJobSubmission.jobNo) + "_lsfLog.txt")).getAbsoluteFile();
    org.genepattern.drm.DrmJobSubmission job = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).logFile(absLogFile).build();
    assertEquals(absLogFile.getAbsolutePath(), job.getLogFile().getAbsolutePath());
}