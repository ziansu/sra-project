@org.junit.Test
public void testSplitForOneCard() {
    models.Game g = new models.Game();
    models.User u = new models.User();
    u.hostGame = g;
    models.Card card1 = new models.Card(8, Suit.Clubs, true);
    g.dealCardToCol(0, card1);
    u.split();
    assertEquals(false, u.isSplit);
}