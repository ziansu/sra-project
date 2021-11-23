private int iterateLine(int c) {
    int ind = 0;
    int ca = 0;
    for (int i = 9; i > 0; i--) {
        ca = buildLine(c, i, ind);
        ind++;
    }
    return ca;
}