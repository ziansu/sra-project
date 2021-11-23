@org.junit.Test
public void testNotStay() {
    models.Game g = new models.Game();
    models.User u = new models.User();
    models.Card card1 = new models.Card(8, Suit.Clubs, true);
    models.Card card2 = new models.Card(10, Suit.Diamonds, true);
    g.cols.add(new java.util.ArrayList<models.Card>());
    u.dealCardToCol(0, card1);
    u.dealCardToCol(0, card2);
    u.stay(3);
    assertEquals(false, u.zeroStayed);
}