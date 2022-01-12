public void start(lifeExplorer.Board b, int sizeOfCell) {
    cellSize = sizeOfCell;
    board = b;
    if (((board.getHeight()) != (board.getWide())) || (((board.getHeight()) % sizeOfCell) != 0)) {
        throw new java.lang.RuntimeException("Board dimensiones must be equal and multiples of the cell size");
    }
    create();
}