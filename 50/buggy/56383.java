private void switchPlayerTurn() {
    if ((playerTurn) == (players.size())) {
        playerTurn = 0;
    }else {
        (playerTurn)++;
    }
}