private static void fillBlankCells(Cell[][] grid) {
    for (int row = 0; row < (grid.length); row++) {
        for (int col = 0; col < (grid[row].length); col++) {
            grid[row][col] = new Cell(row, col);
        }
    }
}