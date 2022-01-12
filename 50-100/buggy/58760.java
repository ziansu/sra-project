@org.junit.Test
public void testUTF16Stream() throws java.lang.Exception {
    byte[] b1 = org.apache.commons.io.IOUtils.toByteArray(java.lang.ClassLoader.class.getResourceAsStream("/sax/utf16le.xml"));
    byte[] b2 = org.apache.commons.io.IOUtils.toByteArray(new org.apache.commons.io.input.BOMInputStream(java.lang.ClassLoader.class.getResourceAsStream("/sax/utf16le.xml")));
    org.junit.Assert.assertEquals(b1.length, b2.length);
    int idx = 0;
    for (byte b : b1) {
        org.junit.Assert.assertEquals(b, b2[(idx++)]);
    }
}