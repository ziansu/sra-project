private boolean isAbe11Conitnue() {
    boolean isAbe11Conitnue = true;
    int tempValue = 0;
    for (shil.bjrsh.core.Card card : this.cards) {
        tempValue += card.getValue();
    }
    if (this.cards.contains(Card.One1)) {
        tempValue -= Card.One1.getValue();
        tempValue += Card.Eleven.getValue();
        if ((tempValue >= (BlackJackInfo.DealerStop)) && (tempValue <= (BlackJackInfo.BlackJack))) {
            isAbe11Conitnue = false;
        }
    }
    return isAbe11Conitnue;
}