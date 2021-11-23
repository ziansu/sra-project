public void endTurn() {
    currentPlayer = 3 - (currentPlayer);
    if ((board.getPossibleMoves(currentPlayer).length) == 0) {
        currentPlayer = 3 - (currentPlayer);
        if ((board.getPossibleMoves(currentPlayer).length) == 0) {
        }else {
            setOponentTurn();
        }
    }else {
        setClientTurn();
    }
}