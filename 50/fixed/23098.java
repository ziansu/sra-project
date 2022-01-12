@org.testng.annotations.Test
public void testComputeOxalisHomeRelativeToUserHome() {
    java.io.File file = new eu.peppol.util.OxalisHomeDirectory().computeOxalisHomeRelativeToUserHome();
    java.lang.String homeDirName = java.lang.System.getProperty("user.home");
    java.io.File oxalisHomeDir = new java.io.File(homeDirName, ".oxalis");
    assertEquals(file, oxalisHomeDir);
}