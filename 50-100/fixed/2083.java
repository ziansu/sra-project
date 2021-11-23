private void initialize(int numDecks) {
    this.numDecks = numDecks;
    for (model.PlayingCard card : model.PlayingCard.values()) {
        cardRestrictions.put(card, new java.util.LinkedHashMap<>());
        for (model.Suit suit : model.Suit.values()) {
            cardRestrictions.get(card).put(suit, numDecks);
        }
    }
}