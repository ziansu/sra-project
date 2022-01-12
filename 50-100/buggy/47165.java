@org.junit.Test
public void testGetBoard() throws java.lang.Exception {
    com.uno.dbbc.checkers.Board board = new com.uno.dbbc.checkers.Board();
    board.initialBoardSetup();
    com.uno.dbbc.checkers.Player player1 = new com.uno.dbbc.checkers.Player("Dark");
    com.uno.dbbc.checkers.Player player2 = new com.uno.dbbc.checkers.Player("Light");
    com.uno.dbbc.checkers.State state = new com.uno.dbbc.checkers.State(board, player1, player2, player1);
    assertEquals(board, state.getBoard());
}