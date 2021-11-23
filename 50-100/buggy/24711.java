protected int[] fromJHPL(int[] transformation) {
    int[] result = new int[transformation.length];
    for (int i = 0; i < (result.length); i++) {
        result[i] = transformation[(((transformation.length) - i) - 1)] += offsetIndices[(((transformation.length) - i) - 1)];
    }
    return result;
}