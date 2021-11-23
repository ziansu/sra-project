@org.junit.Test
public void testNotSplit() {
    models.Game g = new models.Game();
    models.User u = new models.User();
    u.hostGame = g;
    models.Card card1 = new models.Card(8, Suit.Clubs, true);
    models.Card card2 = new models.Card(10, Suit.Diamonds, true);
    g.dealCardToCol(0, card1);
    g.dealCardToCol(0, card2);
    u.split();
    assertEquals(false, u.isSplit);
}