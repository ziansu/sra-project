@org.junit.Test
public void testConfigurableBufferSize() throws java.io.IOException {
    final java.io.File file = org.apache.logging.log4j.core.appender.RandomAccessFileManagerTest.folder.newFile();
    try (final java.io.RandomAccessFile raf = new java.io.RandomAccessFile(file, "rw")) {
        final java.io.OutputStream os = org.apache.logging.log4j.core.util.NullOutputStream.NULL_OUTPUT_STREAM;
        final int bufferSize = 4 * 1024;
        assertNotEquals(bufferSize, RandomAccessFileManager.DEFAULT_BUFFER_SIZE);
        final org.apache.logging.log4j.core.appender.RandomAccessFileManager manager = new org.apache.logging.log4j.core.appender.RandomAccessFileManager(raf, file.getName(), os, bufferSize, null, null, true);
        assertEquals(bufferSize, manager.getBufferSize());
    }
}