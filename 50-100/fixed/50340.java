private boolean[] getVerLine(int sx, int sy, int length, boolean[][] openings) {
    boolean[] booleans = new boolean[length];
    for (int y = 0; y < (booleans.length); y++) {
        booleans[y] = openings[sx][(sy + y)];
    }
    return booleans;
}