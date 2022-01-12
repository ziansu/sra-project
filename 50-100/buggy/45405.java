public void getAllMoves(java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> moveList, int i) {
    for (int d : com.cjmalloy.stratego.player.AI.dir) {
        int t = i + d;
        com.cjmalloy.stratego.Piece tp = b.getPiece(t);
        if (tp == null)
            addMove(moveList.get(com.cjmalloy.stratego.player.AI.FLEE), i, t);
        else
            if ((tp.getColor()) == (1 - (b.bturn)))
                addMove(moveList.get(com.cjmalloy.stratego.player.AI.ATTACK), i, t);
            
        
    }
}