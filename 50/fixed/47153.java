@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSkipNegative() throws java.io.IOException {
    java.io.InputStream is = new java.io.FileInputStream(org.apache.poi.util.TestIOUtils.TMP);
    org.apache.poi.util.IOUtils.skipFully(is, (-1));
}