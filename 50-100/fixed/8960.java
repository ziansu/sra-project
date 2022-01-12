public static boolean listContainsArray(java.util.List<double[]> list, double[] array) {
    for (double[] element : list) {
        if (java.util.Arrays.equals(element, array)) {
            return true;
        }
    }
    return false;
}