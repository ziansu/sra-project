private boolean getMoves(java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> moveList, int n) {
    com.cjmalloy.stratego.BitGrid bg = new com.cjmalloy.stratego.BitGrid();
    boolean isPruned = getMovablePieces(n, bg);
    return (getMoves(bg, moveList, n)) || isPruned;
}