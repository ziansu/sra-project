private boolean isAbe11Conitnue() {
    boolean isAbe11Conitnue = true;
    int tempValue = 0;
    for (shil.bjrsh.core.Card card : this.cards) {
        if (Card.One1.equals(card)) {
            int test = tempValue + (Card.Eleven.getValue());
            if ((test >= (BlackJackInfo.DealerStop)) && (test <= (BlackJackInfo.BlackJack))) {
                isAbe11Conitnue = false;
                break;
            }
        }
        tempValue += card.getValue();
    }
    return isAbe11Conitnue;
}