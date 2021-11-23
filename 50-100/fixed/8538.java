public static ca.claytonrogers.Common.Deck getShuffledDeck() {
    ca.claytonrogers.Common.Deck deck = new ca.claytonrogers.Common.Deck();
    for (int i = 1; i <= 13; i++) {
        for (int j = 0; j < 4; j++) {
            deck.push(new ca.claytonrogers.Common.Card(i, false, Card.Suit.values()[j]));
        }
    }
    deck.shuffle(Constants.random);
    return deck;
}