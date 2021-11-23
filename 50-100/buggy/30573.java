public boolean canTake(chess.board.Tile moveTile, int dX, int dY) {
    if ((moveTile.getPiece()) == null)
        return false;
    
    if ((dX != 1) && (dX != (-1)))
        return false;
    
    if (((dY == (-1)) || (dX == 1)) && (moveTile.containsEnemy(this)))
        return true;
    
    return false;
}