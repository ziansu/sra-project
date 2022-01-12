public void lostOrWon() {
    int counter = 0;
    for (java.lang.Object card : dealerCards) {
        if (card instanceof blackjackgame.Card) {
            counter += ((blackjackgame.Card) (card)).value;
        }
    }
    if (counter < 21) {
        java.lang.System.out.println(((name) + " won "));
    }else {
        java.lang.System.out.println(((name) + " lost "));
    }
}