public void init(int numPacks) {
    int counter = 0;
    for (int i = 0; i < (cards.length); ++i) {
        if (counter >= 52)
            counter = 0;
        
        cards[i] = Deck.masterPack[counter];
        counter++;
    }
    topCard = (52 * numPacks) - 1;
}