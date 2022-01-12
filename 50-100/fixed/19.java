private boolean[] getHorLine(int sx, int sy, int length, boolean[][] openings) {
    boolean[] booleans = new boolean[length];
    for (int x = 0; x < (booleans.length); x++) {
        booleans[x] = openings[(sx + x)][sy];
    }
    return booleans;
}