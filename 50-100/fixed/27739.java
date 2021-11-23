private int iterateLine(int c) {
    int ind = 0;
    int ca = c;
    for (int i = 9; i > 0; i--) {
        ca = buildLine(ca, i, ind);
        ind++;
    }
    return ca;
}