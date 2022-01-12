public java.lang.Boolean wouldMoveNextLater(cive.shogi.Piece selected_piece, java.awt.Point dst) {
    cive.shogi.Piece p = null;
    try {
        p = selected_piece.clone();
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
    if (p == null)
        return false;
    
    p.setPoint(dst);
    return (p.getCapablePutPoint(attacker, defender).size()) > 0;
}