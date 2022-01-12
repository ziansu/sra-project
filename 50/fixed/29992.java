public void setNumDecks(int numDecks) {
    this.numDecks = numDecks;
    clear();
    initialize(numDecks);
}