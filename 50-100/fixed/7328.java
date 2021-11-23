public void shuffle() {
    for (int i = 51; i > 0; i--) {
        int shuf = ((int) ((java.lang.Math.random()) * (i + 1)));
        Card temp = deck[i];
        deck[i] = deck[shuf];
        deck[shuf] = temp;
    }
    cardsUsed = 0;
}