public void clearBoard() {
    for (int i = 0; i < (sizeX); i++) {
        for (int j = 0; j < (sizeY); j++) {
            board.getCellAt(i, j).setCurrentState(CellState.DEAD);
        }
    }
    updateBoard();
}