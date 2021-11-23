public static double getLargestValue(double[] array) {
    int size = array.length;
    double largest = array[0];
    for (int i = 0; i < (size - 1); i++) {
        largest = java.lang.Math.max(largest, array[(i + 1)]);
    }
    return largest;
}