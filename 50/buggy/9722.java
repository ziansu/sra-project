@org.junit.Test
public void testApplicationInfoVersion() {
    org.junit.Assert.assertEquals("Version mismatch", "1.1.0-SNAPSHOT", appInfo.getVersion());
    appInfo.getVersion();
}