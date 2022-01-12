public static boolean listContainsArray(java.util.List<float[]> list, float[] array) {
    for (float[] element : list) {
        if (java.util.Arrays.equals(element, array)) {
            return true;
        }
    }
    return false;
}