@org.junit.Test
public void testGutterGame() throws java.lang.Exception {
    rollMany(20, 0);
    assertEquals(0, g.score());
}