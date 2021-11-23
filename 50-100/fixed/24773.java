public static int[] grow(int[] x, int lengthToAdd) {
    int[] result = new int[(x.length) + lengthToAdd];
    for (int i = lengthToAdd; i < (result.length); ++i) {
        result[i] = x[(i - lengthToAdd)];
    }
    return result;
}