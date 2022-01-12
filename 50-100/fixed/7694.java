@org.junit.Test
public final void testGetGrid() {
    final int num = 20;
    gamelogic.Board board = new gamelogic.Board();
    gamelogic.Square[][] grid = new gamelogic.Square[num][num];
    board.setGrid(grid);
    org.junit.Assert.assertTrue((grid == (board.getGrid())));
}