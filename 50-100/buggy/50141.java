public void init(int numPacks) {
    int counter = 0;
    for (Card card : cards) {
        if (counter >= 52)
            counter = 0;
        
        card = Deck.masterPack[counter];
        counter++;
        topCard = (52 * numPacks) - 1;
    }
}