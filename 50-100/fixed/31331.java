private boolean leavesCurrentPlayerInCheck() {
    models.Game futureGame = game.clone();
    futureGame.makeMove(fromRow, fromColumn, toRow, toColumn, true);
    models.Color checkedColor = futureGame.colorInCheck();
    boolean leavesCurrentPlayerInCheck = checkedColor == (piece.color);
    return leavesCurrentPlayerInCheck;
}