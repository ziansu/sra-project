private static int minIndex(double[] array) {
    int index = -1;
    double min = java.lang.Double.POSITIVE_INFINITY;
    for (int i = 0; i < (array.length); i++) {
        if ((array[i]) < min) {
            min = array[i];
            index = i;
        }
    }
    return index;
}