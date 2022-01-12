@org.junit.Test
public void acceptChecksAcceptsWithRootTagProjectIfExtensionIsXMLAndNonStandardName() throws java.lang.Exception {
    com.buschmais.jqassistant.plugin.maven3.impl.scanner.MavenPomFileScannerPlugin plugin = new com.buschmais.jqassistant.plugin.maven3.impl.scanner.MavenPomFileScannerPlugin();
    java.io.InputStream inputStream = new java.io.ByteArrayInputStream("<project><a></a></project>".getBytes(java.nio.charset.StandardCharsets.UTF_8));
    com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource fileResource = org.mockito.Mockito.mock(com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource.class, com.buschmais.jqassistant.plugin.maven3.impl.scanner.MavenPomFileScannerPluginTest.NOT_MOCKED_ANSWER);
    org.mockito.Mockito.doReturn(inputStream).when(fileResource).createStream();
    java.lang.String path = "/a/b/c/d.xml";
    boolean result = plugin.accepts(fileResource, path, com.buschmais.jqassistant.plugin.maven3.impl.scanner.MavenPomFileScannerPluginTest.DUMMY_SCOPE);
    assertThat(result, org.hamcrest.core.Is.is(false));
}