public void getAttackMoves(java.util.ArrayList<java.lang.Integer> moveList, int i) {
    for (int d : com.cjmalloy.stratego.player.AI.dir) {
        int t = i + d;
        com.cjmalloy.stratego.Piece tp = b.getPiece(t);
        if ((tp != null) && ((tp.getColor()) == (1 - (b.bturn))))
            addMove(moveList, i, t);
        
    }
}