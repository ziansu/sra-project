public void addCard(Card inputCard) {
    for (int i = 0; i < (pileDeck.length); i++) {
        if ((pileCounter) >= ((pileSize) - 1)) {
            growPileSize();
        }
        if ((pileDeck[i]) == null) {
            pileDeck[i] = inputCard;
            break;
        }
        (pileCounter)++;
    }
}