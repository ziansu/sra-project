@org.junit.Test
public void shouldUseSystemTempDirAsParentFolder() throws java.lang.Exception {
    java.lang.String namePattern = "%t\\a\\b.log";
    java.io.File logDir = new org.neo4j.wrapper.LoggingService(namePattern).getLogDir();
    org.junit.Assert.assertEquals("C:\\tmpDir\\a", logDir.getAbsolutePath());
}