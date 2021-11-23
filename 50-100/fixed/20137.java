private void checkRoundWinner() {
    if (checkPassed()) {
        playerWonRound = getRoundWinner();
        addLog(((playerWonRound.getName()) + " Won the round!"));
        turnNo = players.indexOf(playerWonRound);
        roundEnd = true;
        currentCategory = null;
    }
}