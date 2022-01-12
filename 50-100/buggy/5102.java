public static boolean listContainsArray(java.util.List<long[]> list, long[] array) {
    for (long[] element : list) {
        if (!(java.util.Arrays.equals(element, array))) {
            return false;
        }
    }
    return true;
}