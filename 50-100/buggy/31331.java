private boolean leavesCurrentPlayerInCheck() {
    models.Game futureGame = game.clone();
    java.lang.System.out.println(("1 0 original " + (game.getBoard()[1][0])));
    java.lang.System.out.println(("1 0 future g " + (futureGame.getBoard()[1][0])));
    futureGame.makeMove(fromRow, fromColumn, toRow, toColumn, true);
    models.Color checkedColor = futureGame.colorInCheck();
    boolean leavesCurrentPlayerInCheck = checkedColor == (piece.color);
    java.lang.System.out.println("CHECK FOR CHECK");
    return leavesCurrentPlayerInCheck;
}