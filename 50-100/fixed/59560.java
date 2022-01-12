private int manhattanDistance(int i, int j) {
    int b = (tiles[i][j]) - 1;
    int br = b / (N);
    int bc = b % (N);
    return (java.lang.Math.abs((br - i))) + (java.lang.Math.abs((bc - j)));
}