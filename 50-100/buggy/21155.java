private boolean straightCards() {
    boolean straightCards = true;
    for (int i = 1; i < (cardArray.length); i++) {
        if ((cardArray[(i - 1)].getGameValue()) != ((cardArray[i].getGameValue()) - 1)) {
            straightCards = false;
        }
    }
    return straightCards;
}