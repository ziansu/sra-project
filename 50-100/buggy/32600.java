public void rebuildDeck() {
    this.deck.addAll(discarded);
    Card c = deck.get(0);
    if (c instanceof Train) {
        this.shuffle = true;
    }
    shuffle();
    this.discarded.clear();
}