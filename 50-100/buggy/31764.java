public void testOpenSimpleXliff() throws java.io.IOException, java.net.URISyntaxException, javax.xml.stream.XMLStreamException {
    ocelotApp.openFile(loadResource("/test.xlf"), false);
    org.junit.Assert.assertEquals("en", ocelotApp.getFileSourceLang());
    org.junit.Assert.assertEquals("fr", ocelotApp.getFileTargetLang());
    org.junit.Assert.assertTrue(ocelotApp.hasOpenFile());
    org.junit.Assert.assertFalse(ocelotApp.isFileDirty());
}