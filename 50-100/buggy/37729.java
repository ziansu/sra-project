@org.junit.Test
public void testEqualsFormatNullBoth() {
    com.github.fishio.logging.TxtFileHandler handler2 = new com.github.fishio.logging.TxtFileHandler(new com.github.fishio.logging.TimeStampFormat(), new java.io.File(folder.getRoot(), "test.txt"));
    handler.setFormat(null);
    handler2.setFormat(null);
    org.junit.Assert.assertTrue(handler.equals(handler2));
    try {
        handler2.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}