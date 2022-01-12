@org.junit.Test
public void testCanMoveTo() {
    chess.Piece piece = new chess.Piece("P", 'a', 2, true);
    assertEquals(true, piece.canMoveTo('a', 3, false));
    assertEquals(false, piece.canMoveTo('e', 4, false));
}