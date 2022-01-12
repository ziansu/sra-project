public void lostOrWon(blackjackgame.Dealer dealer) {
    boolean won = true;
    for (java.lang.Object card : dealerCards) {
        if (card instanceof blackjackgame.Card) {
            int number = getTheValueOfTheCurrentDeck();
            if (number > 21) {
                won = false;
            }
        }
    }
    if (won) {
        java.lang.System.out.println(((name) + " lost "));
    }else {
        java.lang.System.out.println(((name) + " won "));
    }
}