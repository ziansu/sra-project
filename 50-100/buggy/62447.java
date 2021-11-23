public void buildDeck() {
    for (int i = 2; i < 15; i++) {
        deck.add(new models.Card(i, Suit.Clubs));
        deck.add(new models.Card(i, Suit.Hearts));
        deck.add(new models.Card(i, Suit.Diamonds));
        deck.add(new models.Card(i, Suit.Spades));
    }
}