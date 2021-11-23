@org.junit.Test
public void testBoardDimensions() {
    java.lang.System.out.println(tests.TestClueBoard.board);
    assertEquals(tests.TestClueBoard.NUM_ROWS, tests.TestClueBoard.board.getNumRows());
    assertEquals(tests.TestClueBoard.NUM_COLUMNS, tests.TestClueBoard.board.getNumColumns());
}