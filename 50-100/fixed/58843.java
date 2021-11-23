@org.junit.Test
public void testSplit() {
    models.Game g = new models.Game();
    models.User u = new models.User();
    models.Card card1 = new models.Card(8, Suit.Clubs, true);
    models.Card card2 = new models.Card(8, Suit.Diamonds, true);
    u.dealCardToCol(0, card1);
    u.dealCardToCol(0, card2);
    u.split();
    assertEquals(true, u.isSplit);
}