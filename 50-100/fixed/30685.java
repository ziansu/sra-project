public int[] keys(int index) {
    int[] res = new int[numDimensions];
    for (int d = 0; d < (numDimensions); d++) {
        res[d] = key(d, index);
    }
    return res;
}