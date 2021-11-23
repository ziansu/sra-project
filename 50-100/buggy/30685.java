public int[] keys(int index) {
    int[] res = new int[numDimensions];
    for (int d = 0; d < (numDimensions); d++) {
        res[d] = ndKeys[d].get(index);
    }
    return res;
}