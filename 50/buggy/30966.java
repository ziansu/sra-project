public Board twin() {
    Board board = new Board(data);
    board.iZero = iZero;
    board.jZero = jZero;
    return board;
}