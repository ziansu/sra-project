public boolean startRound() {
    boolean ante = player.anteUp();
    if (ante) {
        if ((roundCount) > 0) {
            collectTrash();
        }
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