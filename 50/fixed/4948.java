@org.junit.Test
public void testSetGetBitcoins() {
    assertEquals("getBitcoins error.", 0, player2.getBitcoins(), 0);
    player1.setBitcoins(100);
    assertEquals("setBitcoins error.", 100, player1.getBitcoins(), 0);
}