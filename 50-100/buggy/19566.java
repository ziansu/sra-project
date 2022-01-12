public boolean valableDeck(Deck deck) {
    boolean test = true;
    for (int i = 0; (i < (deck.size())) || test; i++) {
        if ((occurInDeck(this.deck.get(i))) > (this.deck.get(i).getMax()))
            test = false;
        
    }
    return test;
}