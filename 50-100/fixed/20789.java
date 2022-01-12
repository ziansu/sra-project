@org.junit.Test
public void testDeal53Cards() {
    final com.owodigi.model.Deck deck = com.owodigi.model.DeckFactory.newInstance();
    for (int i = 1; i <= 52; ++i) {
        org.junit.Assert.assertNotNull("Expect first 52 dealt cards to be non null", deck.dealOneCard());
    }
    org.junit.Assert.assertNull("Expected 53rd dealt card to be null", deck.dealOneCard());
}