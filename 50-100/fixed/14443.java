public static boolean listContainsArray(java.util.List<boolean[]> list, boolean[] array) {
    for (boolean[] element : list) {
        if (java.util.Arrays.equals(element, array)) {
            return true;
        }
    }
    return false;
}