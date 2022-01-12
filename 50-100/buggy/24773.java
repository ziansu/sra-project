public static int[] grow(int[] x, int lengthToAdd) {
    int[] result = new int[(x.length) + lengthToAdd];
    for (int i = 1; i < (result.length); ++i) {
        result[i] = x[(i - 1)];
    }
    return result;
}