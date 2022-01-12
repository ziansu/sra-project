private boolean hasMine(org.minesweeper.core.Cell[][] board, org.minesweeper.core.Cell cell) {
    return hasMine(board, cell.getX(), cell.getY());
}