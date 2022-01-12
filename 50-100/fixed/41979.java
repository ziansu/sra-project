@java.lang.Override
public void call() {
    currentPlayer.resetBet();
    int betAmount = (getHighestBet()) - (currentPlayer.getLastBet());
    currentPlayer.addToBet(betAmount);
    currentPlayer.bet(currentPlayer.getBet());
    currentPlayer.changePersonState(PersonState.WAITING);
    (playersFinished)++;
}