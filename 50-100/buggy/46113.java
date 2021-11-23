public boolean canPlaceInside(java.awt.Point src, java.awt.Point dst) {
    cive.shogi.Piece p = attacker.getPieceOnBoardAt(src);
    if ((p.getTypeOfPiece()) == (Piece.NONE))
        return false;
    
    java.util.Set<java.awt.Point> s = p.getCapablePutPoint(attacker, defender);
    if ((s.size()) == 0)
        return false;
    
    return s.contains(dst);
}