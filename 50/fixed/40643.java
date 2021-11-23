private void set(org.minesweeper.core.Cell[][] board, int x, int y, int neighbouringMineCount) {
    get(board, x, y).setNeighbouringMineCount(neighbouringMineCount);
}