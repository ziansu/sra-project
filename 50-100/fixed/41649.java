@org.junit.Test
public void testSetGetBW() {
    java.io.BufferedWriter bw2 = null;
    try {
        bw2 = new java.io.BufferedWriter(new java.io.FileWriter(new java.io.File(folder.getRoot(), filename)));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    handler.setBufferedWriter(bw2);
    org.junit.Assert.assertEquals(bw2, handler.getBufferedWriter());
}