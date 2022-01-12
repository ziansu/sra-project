@org.junit.Test
public void testStayFor0ColBusted() {
    models.Game g = new models.Game();
    models.User u = new models.User();
    u.hostGame = g;
    models.Card card1 = new models.Card(10, Suit.Clubs, true);
    models.Card card2 = new models.Card(10, Suit.Diamonds, true);
    g.cols.add(new java.util.ArrayList<models.Card>());
    g.dealCardToCol(0, card1);
    g.dealCardToCol(0, card2);
    u.stay(0);
    assertEquals(true, u.zeroStayed);
}