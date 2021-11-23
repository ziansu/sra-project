public org.minesweeper.core.Cell get(org.minesweeper.core.Cell[][] board, org.minesweeper.core.Cell cell) {
    return get(board, cell.getX(), cell.getY());
}