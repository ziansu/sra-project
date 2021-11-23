private boolean[] getHorLine(int sx, int sy, int length, boolean[][] openings) {
    boolean[] booleans = new boolean[length];
    for (int x = sx; x < (booleans.length); x++) {
        booleans[0] = openings[x][sy];
    }
    return booleans;
}