public static void main(java.lang.String[] args) {
    Board board = new Board(13, 12, 3);
    board.addBlock('+');
    board.addBlock('+');
    board.addBlock('+');
    board.evaluate();
    board.printBoard();
}