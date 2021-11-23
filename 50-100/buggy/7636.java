@org.junit.Test
public void testEqualsEqual() {
    com.github.fishio.logging.TxtFileHandler handler2 = new com.github.fishio.logging.TxtFileHandler(new com.github.fishio.logging.TimeStampFormat(), new java.io.File(folder.getRoot(), "test.txt"));
    com.github.fishio.logging.DefaultFormat df = new com.github.fishio.logging.DefaultFormat();
    handler.setFormat(df);
    handler2.setFormat(df);
    org.junit.Assert.assertTrue(handler.equals(handler2));
    try {
        handler2.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}