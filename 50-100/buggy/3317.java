@org.junit.Test
public void testCanAttackingPieceBeBlocked() throws java.text.ParseException {
    board = chessBoardFactory.getChessBoard("qh8:Kh3:Ra4:kf2");
    org.amc.game.chess.Move move = new org.amc.game.chess.Move(new org.amc.game.chess.Location(H, 8), new org.amc.game.chess.Location(H, 5));
    board.move(move);
    org.amc.game.chess.view.ChessBoardView view = new org.amc.game.chess.view.ChessBoardView(board);
    view.displayTheBoard();
    org.amc.game.chess.KingInCheckmate pkicc = new org.amc.game.chess.KingInCheckmate(blackPlayer, whitePlayer, board);
    assertFalse(pkicc.canAttackingPieceNotBeBlocked());
}