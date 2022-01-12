@org.junit.Test
public void testCustomValue() {
    org.genepattern.drm.DrmJobSubmission drmJobSubmission = new org.genepattern.drm.DrmJobSubmission.Builder(workingDir).jobContext(jobContext).build();
    org.junit.Assert.assertArrayEquals("'customValue' from 'drm_test.yaml'", new java.lang.String[]{ "A" , "B" , "C" }, drmJobSubmission.getValue("customValue").getValues().toArray());
}