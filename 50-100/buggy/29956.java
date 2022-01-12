public java.util.ArrayList<org.minesweeper.core.Cell> getMarkedCells() {
    java.util.ArrayList<org.minesweeper.core.Cell> marked = new java.util.ArrayList(((getHeight()) * (board[0].length)));
    for (org.minesweeper.core.Cell[] row : board) {
        for (org.minesweeper.core.Cell cell : row) {
            if (isMarked(cell)) {
                marked.add(new org.minesweeper.core.Cell(cell, true));
            }
        }
    }
    return marked;
}