@org.junit.Test
public void testEqualsFormatNull() {
    com.github.fishio.logging.TxtFileHandler handler2 = new com.github.fishio.logging.TxtFileHandler(new com.github.fishio.logging.TimeStampFormat(), new java.io.File(folder.getRoot(), "test.txt"));
    handler.setFormat(null);
    org.junit.Assert.assertFalse(handler.equals(handler2));
    try {
        handler2.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}