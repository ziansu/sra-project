private void initBoard() {
    for (int x = 0; x < (board.Board.BOARDSIZE); x++) {
        for (int y = 0; y < (board.Board.BOARDSIZE); y++) {
            board[x][y] = new board.Cell(new board.Gem(board.GemType.randomGem()));
            while (isTripletAt(x, y)) {
                board[x][y] = new board.Cell(new board.Gem(board.GemType.randomGem()));
            } 
        }
    }
}