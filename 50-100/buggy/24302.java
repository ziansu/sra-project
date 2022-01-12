public boolean positionsAreLinear(thud.BoardPoint startPos, thud.BoardPoint endPos) {
    return (((startPos.row) == (endPos.row)) || ((startPos.col) == (endPos.col))) || ((java.lang.Math.abs((((startPos.col) - (endPos.col)) / ((startPos.row) - (endPos.row))))) == 1);
}