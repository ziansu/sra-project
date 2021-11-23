public static boolean listContainsArray(java.util.List<short[]> list, short[] array) {
    for (short[] element : list) {
        if (java.util.Arrays.equals(element, array)) {
            return true;
        }
    }
    return false;
}