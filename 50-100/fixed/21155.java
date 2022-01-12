private boolean straightCards() {
    boolean straightCards = true;
    for (int i = 1; i < (cardArray.length); i++) {
        if ((cardArray[i].getGameValue()) != ((cardArray[(i - 1)].getGameValue()) - 1)) {
            straightCards = false;
        }
    }
    return straightCards;
}