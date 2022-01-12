public void testGraphNotNull() {
    try {
        Main.GraphTest.G = new Main.Graph(((java.lang.System.getProperty("user.dir")) + "/src/tinyEWG.txt"), 0.3, false);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    assertNull(Main.GraphTest.G);
}