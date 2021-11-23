public boolean threeOfAKind() {
    int count = 0;
    cardValues = numberOfCards(myCards);
    for (int i = 0; i < 13; i++) {
        if ((cardValues[i]) == 3) {
            count = 1;
        }
    }
    if (count == 1) {
        return true;
    }else {
        return false;
    }
}