private edu.swe681.traverse.game.GameBoard makeGenericMoveToAdvanceTurn(edu.swe681.traverse.game.GameBoard board) throws game.TraverseException {
    edu.swe681.traverse.game.GameBoard newBoard;
    if ((board.getGameState().getCurrentPlayerID()) == (board.getPlayerOneID())) {
        newBoard = parseAndMakeMove(board, java.lang.String.format("0,%d 1", ((genericMoveNum) + 1)));
        (genericMoveNum)++;
    }else {
        newBoard = parseAndMakeMove(board, java.lang.String.format("8,%d 1", (9 - ((genericMoveNum) + 1))));
        (genericMoveNum)++;
    }
    return newBoard;
}