@org.junit.Test
public void testEqualsEqual() {
    com.github.fishio.logging.TxtFileHandler handler2 = new com.github.fishio.logging.TxtFileHandler(new com.github.fishio.logging.TimeStampFormat(), new java.io.File(folder.getRoot(), filename));
    com.github.fishio.logging.DefaultFormat df = new com.github.fishio.logging.DefaultFormat();
    handler.setFormat(df);
    handler2.setFormat(df);
    org.junit.Assert.assertEquals(handler, handler2);
    try {
        handler2.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}