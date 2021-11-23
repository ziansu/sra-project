public void clearBoard() {
    for (int i = 0; i < (this.sizeX); i++) {
        for (int j = 0; j < (this.sizeY); j++) {
            this.board.getCellAt(i, j).setCurrentState(CellState.DEAD);
        }
    }
    updateBoard();
}