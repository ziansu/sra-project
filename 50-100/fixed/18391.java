public void start(lifeExplorer.Board b, int sizeOfCell) {
    cellSize = sizeOfCell;
    board = b;
    if (((board.getHeight()) != (board.getWide())) || (((board.getHeight()) % sizeOfCell) != 0)) {
    }
    create();
}