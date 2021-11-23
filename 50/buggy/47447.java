public int findAStarVal(int[] point) {
    return java.lang.Math.abs(((findDistToEnd(point)) - (numCurrentMoves)));
}