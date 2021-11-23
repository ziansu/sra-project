public void shuffle() {
    for (int i = 0; i < (deck.length); i++) {
        Cards temp = deck[i];
        int randomNum = ((int) ((java.lang.Math.random()) * (i + 1)));
        deck[i] = deck[randomNum];
        deck[randomNum] = temp;
    }
}