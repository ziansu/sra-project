public boolean makeTurn(int posOnBoard, int turn) throws something.Reversi.IllegalMoveException {
    if ((this.board[posOnBoard]) == (Tile.EMPTY)) {
        something.Reversi.Tile tile;
        if ((turn % 2) == 0) {
            tile = Tile.BLACK;
        }else {
            tile = Tile.WHITE;
        }
        if (checkValidityMove(posOnBoard, tile)) {
            board[posOnBoard] = tile;
            turnTiles(posOnBoard, tile);
            return true;
        }
    }
    return false;
}