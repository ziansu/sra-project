private void testInitialScore(int expected) {
    code.Inventory i = new code.Inventory();
    code.Player p = new code.Player(i);
    int actual = p.getScore();
    org.junit.Assert.assertTrue(((("I tested whether or not the Player's score was" + expected) + "and it should have returned") + actual), (actual == expected));
}