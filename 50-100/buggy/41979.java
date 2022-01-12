@java.lang.Override
public void call() {
    java.lang.System.out.println(("highestBet: " + (highestBet)));
    java.lang.System.out.println(("lastbet: " + (currentPlayer.getLastBet())));
    currentPlayer.resetBet();
    int betAmount = (getHighestBet()) - (currentPlayer.getLastBet());
    currentPlayer.addToBet(betAmount);
    currentPlayer.bet(currentPlayer.getBet());
    currentPlayer.changePersonState(PersonState.WAITING);
    (playersFinished)++;
}