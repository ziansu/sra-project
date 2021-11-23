@org.junit.Test
public void testDeckGetCardsRemaining() {
    models.Deck deck = new models.Deck();
    org.junit.Assert.assertEquals(52, deck.getCardsRemaining());
}