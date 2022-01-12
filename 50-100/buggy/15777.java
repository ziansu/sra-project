public static boolean listContainsArray(java.util.List<int[]> list, int[] array) {
    for (int[] element : list) {
        if (!(java.util.Arrays.equals(element, array))) {
            return false;
        }
    }
    return true;
}