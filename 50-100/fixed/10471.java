public void shuffle() {
    sorted = false;
    for (int i = (topCard) - 1; i > 0; i--) {
        int randomPos = ((int) ((java.lang.Math.random()) * (topCard)));
        Card temp = cards[i];
        cards[i] = cards[randomPos];
        cards[randomPos] = temp;
    }
}