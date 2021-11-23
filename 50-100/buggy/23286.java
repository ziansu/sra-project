public boolean putPiece(int x, int y) {
    if (turnPlayer) {
        board.setValue(x, y, p1.getBrand());
    }else {
        board.setValue(x, y, p2.getBrand());
    }
    board.showBoard();
    winner = board.validateGame();
    return winner;
}