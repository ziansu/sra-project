@org.junit.Test
public void testBoardDimensions() {
    assertEquals(tests.TestClueBoard.NUM_ROWS, tests.TestClueBoard.board.getNumRows());
    assertEquals(tests.TestClueBoard.NUM_COLUMNS, tests.TestClueBoard.board.getNumColumns());
}