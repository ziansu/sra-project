public int getTheValueOfTheCurrentDeck() {
    int counter = 0;
    for (java.lang.Object card : this.dealerCards) {
        if (card instanceof blackjackgame.Card) {
            counter += ((blackjackgame.Card) (card)).value;
        }
    }
    return counter;
}