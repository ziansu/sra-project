public boolean positionsAreLinear(thud.BoardPoint startPos, thud.BoardPoint endPos) {
    return (((startPos.row) == (endPos.row)) || ((startPos.col) == (endPos.col))) || ((((double) (java.lang.Math.abs(((startPos.col) - (endPos.col))))) / ((double) (java.lang.Math.abs(((startPos.row) - (endPos.row)))))) == 1);
}