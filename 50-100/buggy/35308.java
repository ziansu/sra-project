public boolean checkStatus(io.zipcoder.zealotscasino.Player player, double bet) {
    boolean bust = playerHand.checkIfBust();
    boolean blackJack = playerHand.checkIfBlackJack();
    if (bust) {
        displayLoseGame();
        setGameRunning(false);
        return false;
    }
    if (blackJack) {
        executePlayerWins(player);
    }
    boolean hit = checkIfPlayerHit();
    return hit;
}