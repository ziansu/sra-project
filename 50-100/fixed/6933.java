public void Promote() {
    chessgame.Queen Promotion;
    if ((player) == 1) {
        Promotion = new chessgame.Queen("WhitePromotedPawn");
        Promotion.setIcon(WhiteQueenImg);
        current.removePiece();
        current.setPiece(Promotion);
    }else {
        Promotion = new chessgame.Queen("BlackPromotedPawn");
        Promotion.setIcon(BlackQueenImg);
        current.removePiece();
        current.setPiece(Promotion);
    }
    current.repaint();
    current.validate();
}