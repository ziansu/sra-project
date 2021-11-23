public void addCard(Card inputCard) {
    for (int i = 0; i < (pileDeck.length); i++) {
        if ((pileCounter) >= (pileSize)) {
            growPileSize();
        }else {
            if (pileDeck[i].equals(null)) {
                pileDeck[i] = inputCard;
            }
            (pileCounter)++;
        }
    }
}