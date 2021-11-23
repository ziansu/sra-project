@java.lang.Override
public void raise() {
    int betHolder = currentPlayer.getBet();
    int betAmount = ((highestBet) - (currentPlayer.getLastBet())) + betHolder;
    if (25 < betAmount) {
        currentPlayer.bet(betAmount);
        addToHighestBet(betAmount);
        currentPlayer.changePersonState(PersonState.WAITING);
        playersFinished = 1;
    }else {
        call();
    }
}