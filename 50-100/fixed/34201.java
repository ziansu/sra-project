public Card dealNextCard() {
    Card top = this.myCards[0];
    for (int c = 1; c < (this.numCards); c++) {
        this.myCards[(c - 1)] = this.myCards[c];
    }
    this.myCards[((this.numCards) - 1)] = null;
    (this.numCards)--;
    return top;
}