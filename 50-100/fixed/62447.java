public void buildDeck() {
    for (int i = 2; i < 15; i++) {
        deck.add(new models.Card(i, Suit.Clubs, null));
        deck.add(new models.Card(i, Suit.Hearts, null));
        deck.add(new models.Card(i, Suit.Diamonds, null));
        deck.add(new models.Card(i, Suit.Spades, null));
    }
}