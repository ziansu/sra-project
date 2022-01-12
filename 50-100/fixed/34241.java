public int getValueOfHand() {
    int value = 0;
    for (blackjack.Card card : this) {
        value += card.getValue();
    }
    if ((value > 21) && ((this.hasAce()) > 0)) {
        value -= (this.hasAce()) * 10;
    }
    return value;
}