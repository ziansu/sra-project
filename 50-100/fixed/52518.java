public void shuffle() {
    int j;
    java.util.Random r = new java.util.Random();
    Card temp;
    for (int i = (this.deck.length) - 1; i > 0; i--) {
        j = r.nextInt((i + 1));
        temp = this.deck[i];
        this.deck[i] = this.deck[j];
        this.deck[j] = temp;
    }
}