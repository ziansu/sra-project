public void testGraphNotNull() {
    try {
        Main.GraphTest.G = new Main.Graph(((java.lang.System.getProperty("user.dir")) + "/src/tinyEWG.txt"), 0.3, false);
        assertNotNull(Main.GraphTest.G);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}