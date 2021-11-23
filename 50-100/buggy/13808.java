public java.lang.Boolean wouldMoveNextLater(cive.shogi.Piece selected_piece, java.awt.Point dst) {
    cive.shogi.Piece p = null;
    try {
        p = selected_piece.clone();
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
    p.setPoint(dst);
    return (selected_piece.getCapablePutPoint(attacker, defender).size()) > 0;
}