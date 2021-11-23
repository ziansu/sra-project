private void populateBoard() {
    this.boardSquares = new location.Square[cluedo.Board.BOARD_WIDTH][cluedo.Board.BOARD_HEIGHT];
    for (int y = 0; y < (cluedo.Board.BOARD_HEIGHT); y++) {
        for (int x = 0; x < (cluedo.Board.BOARD_WIDTH); x++) {
            char square = boardChar(x, y);
            if ((square == '1') || (square == '2')) {
                this.boardSquares[x][y] = new location.Square(x, y);
            }
        }
    }
}