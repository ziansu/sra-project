public long getTriangleNumber(int n) {
    long triNum = 0;
    for (int i = n; i > 0; i--) {
        triNum += i;
    }
    return triNum;
}