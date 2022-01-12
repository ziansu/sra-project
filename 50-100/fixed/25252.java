@org.junit.Test
public void createsIndexWithLocalCSSFile() throws java.lang.Exception {
    java.net.URL cssURL = getClass().getResource("radl-test.css");
    org.junit.Assert.assertTrue("Local CSS file does not exist", new java.io.File(cssURL.getFile()).exists());
    java.lang.String serviceName = createRadl(cssURL, null);
    java.io.File indexFile = new java.io.File(new java.io.File(dir, serviceName), "index.html");
    org.junit.Assert.assertTrue("Documentation not generated", indexFile.exists());
}