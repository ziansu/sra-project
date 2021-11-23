public static boolean listContainsArray(java.util.List<char[]> list, char[] array) {
    for (char[] element : list) {
        if (!(java.util.Arrays.equals(element, array))) {
            return false;
        }
    }
    return true;
}