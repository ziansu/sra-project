public int find(Card c) {
    for (int i = 0; i < (this.hand.length); i++) {
        if ((this.hand[i]) == c) {
            return i;
        }
    }
    return -1;
}