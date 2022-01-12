private java.lang.String diagonalSymbol() {
    if (diagonalsThreeInRow()) {
        return grid[1][1];
    }
    return "";
}