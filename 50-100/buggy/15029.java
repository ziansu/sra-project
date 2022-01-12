@org.junit.Test
public void testDetermineWinnerTie() {
    int dealer_limit = 17;
    int start_chips = 100;
    models.Game g = new models.Game();
    g.player.pushHand(new models.Card(10, Suit.clubs, 10));
    g.player.pushHand(new models.Card(10, Suit.spades, 10));
    g.dealer.pushHand(new models.Card(10, Suit.hearts, 10));
    g.dealer.pushHand(new models.Card(10, Suit.diamonds, 10));
    assertEquals(2, g.determineWinner());
}