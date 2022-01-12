public int getValueOfHand() {
    int value = 0;
    for (blackjack.Card card : this) {
        value += card.getValue();
    }
    if ((value > 21) && (this.hasAce())) {
        value -= 10;
    }
    return value;
}