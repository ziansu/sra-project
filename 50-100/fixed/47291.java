private void initBoard() {
    for (int y = 0; y < (board.Board.BOARDSIZE); y++) {
        for (int x = 0; x < (board.Board.BOARDSIZE); x++) {
            board[y][x] = new board.Cell(new board.Gem(board.GemType.randomGem()));
            while (isTripletAt(x, y)) {
                board[y][x] = new board.Cell(new board.Gem(board.GemType.randomGem()));
            } 
        }
    }
}