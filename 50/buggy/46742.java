public void isDeckEmpty(boolean value) {
    if (value) {
        deckArray.addAll(discardArray);
        discardArray.clear();
        shuffleDeck();
    }
}