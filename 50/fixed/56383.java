private void switchPlayerTurn() {
    if ((playerTurn) == ((players.size()) - 1)) {
        playerTurn = 0;
    }else {
        (playerTurn)++;
    }
}