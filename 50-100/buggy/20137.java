private void checkRoundWinner() {
    if (checkPassed()) {
        playerWonRound = getRoundWinner();
        addLog(((playerWonRound.getName()) + " Won the round!"));
        TrumpGame.shiftArray(players, ((players.size()) - (players.indexOf(playerWonRound))));
        turnNo = 0;
        roundEnd = true;
        currentCategory = null;
    }
}