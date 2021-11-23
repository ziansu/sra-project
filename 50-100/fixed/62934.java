@org.junit.Test
public void testTxtFileHandlerCustom() {
    com.github.fishio.logging.TxtFileHandler handler2 = new com.github.fishio.logging.TxtFileHandler(new com.github.fishio.logging.TimeStampFormat(), new java.io.File(folder.getRoot(), filename));
    org.junit.Assert.assertTrue(((handler2.getFormat()) instanceof com.github.fishio.logging.TimeStampFormat));
    try {
        handler2.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}