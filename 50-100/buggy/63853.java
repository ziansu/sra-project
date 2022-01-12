@org.junit.Test
public void shouldLetWhiteCastleShort() {
    _game.movePiece(BoardPosition.E2, BoardPosition.E4);
    _game.movePiece(BoardPosition.G8, BoardPosition.H6);
    _game.movePiece(BoardPosition.F1, BoardPosition.C4);
    _game.movePiece(BoardPosition.H6, BoardPosition.G8);
    _game.movePiece(BoardPosition.G1, BoardPosition.F3);
    _game.movePiece(BoardPosition.G8, BoardPosition.H6);
    boolean result = _game.movePiece(BoardPosition.E1, BoardPosition.G1);
    java.lang.System.out.println(result);
    org.junit.Assert.assertTrue(result);
}