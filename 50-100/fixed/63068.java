private static boolean isArraySorted(int[] result) {
    if ((result.length) <= 1) {
        return true;
    }
    for (int i = 1; i < (result.length); i++) {
        if ((result[i]) < (result[(i - 1)])) {
            return false;
        }
    }
    return true;
}