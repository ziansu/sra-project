public void endTurn() {
    if ((turnIndex) == ((players.size()) - 1)) {
        turnIndex = 0;
    }else {
        (turnIndex)++;
    }
    currentPlayer = players.get(turnIndex);
}