public int compareTo(cardsuite.Card compare) {
    if (((compare.getCardNumber()) > (this.getCardNumber())) || ((compare.getSuit()) != (this.getSuit()))) {
        return -1;
    }
    if (((compare.getCardNumber()) == (this.getCardNumber())) && ((compare.getSuit()) == (this.getSuit()))) {
        return 0;
    }
    return 1;
}