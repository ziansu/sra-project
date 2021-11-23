@org.junit.Test
public void testManifestNoJUnit() throws java.lang.Exception {
    java.io.File base = new java.io.File(TARGET, "test-bundles");
    java.io.File tikaBundle = new java.io.File(base, "tika-bundle-fork.jar");
    java.util.jar.JarInputStream jarIs = new java.util.jar.JarInputStream(new java.io.FileInputStream(tikaBundle));
    java.util.jar.Manifest mf = jarIs.getManifest();
    java.util.jar.Attributes main = mf.getMainAttributes();
    java.lang.String importPackage = main.getValue("Import-Package");
    boolean containsJunit = importPackage.contains("junit");
    org.junit.Assert.assertFalse("The bundle should not import junit", containsJunit);
}