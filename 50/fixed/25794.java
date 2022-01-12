@org.junit.Test
public final void testLoggingDir() {
    java.io.File loggingDir = new java.io.File(((Constants.APPDATA_DIR) + (Constants.LOGGER_DIR)));
    org.junit.Assert.assertTrue(loggingDir.exists());
}