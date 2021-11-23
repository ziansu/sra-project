private void testAddScore(int original, int add, int total) {
    code.Inventory i = new code.Inventory();
    java.awt.Color c = new java.awt.Color(1);
    code.Player p = new code.Player(i, c);
    int actual = p.addScore(original, add);
    org.junit.Assert.assertTrue(((((((("I tested whether or not the Player's score was" + total) + "after adding") + original) + "and") + add) + "and it should have returned") + actual), (actual == total));
}