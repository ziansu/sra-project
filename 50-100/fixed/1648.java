public board.Cell getNeighbourAt(int x, int y, board.Direction dir) {
    int newX = x + (dir.getDX());
    int newY = y + (dir.getDY());
    if ((((newX >= 0) && (newX < (board.Board.BOARDSIZE))) && (newY >= 0)) && (newY < (board.Board.BOARDSIZE))) {
        return board[newY][newX];
    }else {
        return null;
    }
}