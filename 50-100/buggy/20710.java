@org.junit.Test
public void testExtraArgs() {
    org.genepattern.drm.DrmJobSubmission drmJobSubmission = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).build();
    org.junit.Assert.assertArrayEquals("default 'extraArgs' from 'drm_test.yaml'", new java.lang.String[]{ "-P" , "gpdev" }, drmJobSubmission.getExtraArgs().toArray());
}