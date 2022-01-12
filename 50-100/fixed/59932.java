public boolean startRound() {
    boolean ante = player.anteUp();
    if (ante) {
        (roundCount)++;
        firstTurn = true;
        playerTurn = true;
        tie = false;
        lastMoves = moves;
        moves = 0;
        noWinner = true;
        playerWin = false;
        deal();
    }else {
        noWinner = false;
    }
    return ante;
}