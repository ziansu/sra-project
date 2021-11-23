public static double calcProb(java.util.List<org.shil.bjm.meta.Card> cards, int splitTimes, org.shil.bjm.meta.DeckSet deckset) {
    double prob = 1;
    for (org.shil.bjm.meta.Card card : cards) {
        prob *= deckset.getOneCardProb(card);
        deckset.usedCards(card, 1);
    }
    for (int i = 0; i < splitTimes; i++) {
        prob *= deckset.getOneCardProb(cards.get(0));
        deckset.usedCards(cards.get(0), 1);
    }
    return prob;
}