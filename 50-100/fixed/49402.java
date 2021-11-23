private cardgames.blackjack.Deck getNewDeckIfNeeded(cardgames.blackjack.Deck deck) {
    double deckFactor = 0.75;
    int deckSize = 52;
    if ((deck == null) || (((deck.size()) / ((double) (deckSize))) < (1 - deckFactor))) {
        print("Replacing deck...");
        deck = new cardgames.blackjack.Deck();
        deck.shuffle();
        lenny.reset();
    }
    return deck;
}