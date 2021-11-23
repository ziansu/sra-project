@org.junit.Test
public void testRemoveBitcoins() throws java.lang.Exception {
    player2.removeBitcoins(1);
    assertEquals("error removeBitcoins", 0, player2.getBitcoins(), 0);
}