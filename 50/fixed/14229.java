@org.junit.Test
public void licenseInRoot() {
    java.io.File license = new java.io.File(root, "LICENSE");
    org.junit.Assert.assertTrue(license.exists());
    license = null;
}