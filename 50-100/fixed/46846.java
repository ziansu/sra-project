@org.junit.Test
public void testZipFile02() throws java.io.IOException {
    java.lang.String name = "sample.form";
    java.lang.String data = "test data";
    byte[] result = com.formkiq.server.util.Zips.zipFile(name, data);
    java.io.File tempFile = java.io.File.createTempFile("test", "fkz", null);
    java.io.FileOutputStream fos = new java.io.FileOutputStream(tempFile);
    try {
        fos.write(result);
    } finally {
        org.apache.commons.io.IOUtils.closeQuietly(fos);
    }
    org.junit.Assert.assertTrue(com.formkiq.server.util.Zips.isValid(tempFile));
}