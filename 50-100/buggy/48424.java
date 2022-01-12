@java.lang.SuppressWarnings(value = "unused")
@org.junit.Test
public void testCleanOnInitOneHandler() throws java.lang.Exception {
    generateLogFiles(logsDir, org.apache.juli.TestFileHandler.PREFIX_1, org.apache.juli.TestFileHandler.SUFIX_1, 3);
    org.apache.juli.FileHandler handler = new org.apache.juli.FileHandler(logsDir.getAbsolutePath(), org.apache.juli.TestFileHandler.PREFIX_1, org.apache.juli.TestFileHandler.SUFIX_1, 2);
    java.lang.Thread.sleep(1000);
    org.junit.Assert.assertTrue(((logsDir.list().length) == 16));
}