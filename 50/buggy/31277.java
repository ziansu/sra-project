@org.junit.Test
public void createsProvidedDirectory() throws java.lang.Exception {
    radl.common.io.IO.delete(dir);
    generateClientDocumentation(null);
    org.junit.Assert.assertTrue("Dir not created", dir.exists());
}