private int manhattanDistance(int i, int j) {
    int g = (goal(i, j)) - 1;
    int gr = g / (N);
    int gc = g % (N);
    int b = (tiles[i][j]) - 1;
    int br = b / (N);
    int bc = b % (N);
    return (java.lang.Math.abs((br - gr))) + (java.lang.Math.abs((bc - gc)));
}