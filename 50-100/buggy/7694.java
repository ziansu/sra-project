@org.junit.Test
public final void testGetGrid() {
    gamelogic.Board board = new gamelogic.Board();
    gamelogic.Square[][] grid = new gamelogic.Square[20][20];
    board.setGrid(grid);
    org.junit.Assert.assertTrue((grid == (board.getGrid())));
}