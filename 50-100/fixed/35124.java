private int checkCards(int pValue1, int pValue2, int pSize) {
    int tmpSum = (fieldDeck[0][pValue1].getValue()) + (fieldDeck[0][pValue2].getValue());
    for (int i = pValue2 + 1; i < pSize; i++) {
        if ((tmpSum + (fieldDeck[0][i].getValue())) == 21) {
            return i;
        }
    }
    return 0;
}