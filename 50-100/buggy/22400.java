public static double getLargestMagnitude(double[] array) {
    int size = array.length;
    double largest = array[0];
    for (int i = 0; i < (size - 1); i++) {
        largest = java.lang.Math.max(java.lang.Math.abs(array[i]), java.lang.Math.abs(array[(i + 1)]));
    }
    return java.lang.Math.abs(largest);
}