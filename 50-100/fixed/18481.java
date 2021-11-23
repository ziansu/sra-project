boolean doMove(net.doepner.baghchal.Move move) {
    final net.doepner.baghchal.Piece piece = get(move.p1());
    set(move.p2(), piece);
    clear(move.p1());
    if (move.isTakingMove()) {
        clear(move.middle());
        sound.playPredatorKills();
    }else
        if (piece == (net.doepner.baghchal.Piece.PREDATOR)) {
            sound.playPredatorStep();
        }
    
    return true;
}