private boolean[] getVerLine(int sx, int sy, int length, boolean[][] openings) {
    boolean[] booleans = new boolean[length];
    for (int y = sy; y < (booleans.length); y++) {
        booleans[0] = openings[sx][y];
    }
    return booleans;
}