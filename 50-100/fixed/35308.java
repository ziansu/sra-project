public boolean checkStatus(io.zipcoder.zealotscasino.Player player) {
    boolean bust = playerHand.checkIfBust();
    boolean blackJack = playerHand.checkIfBlackJack();
    if (bust) {
        displayLoseGame();
        setGameRunning(false);
        return false;
    }
    if (blackJack) {
        executePlayerWins(player);
        setGameRunning(false);
        return false;
    }
    return true;
}