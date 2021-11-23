private static int[] insert(int[] array, int t) {
    int[] result = new int[(array.length) + 1];
    for (int i = 0; i < (array.length); i++) {
        result[i] = array[i];
    }
    result[array.length] = t;
    array = null;
    array = result;
    return result;
}