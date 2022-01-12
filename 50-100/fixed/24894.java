public static double[] sobelKernel(int length, int size) {
    if (size <= 0) {
        return null;
    }
    double[] sobelKernel = new double[length];
    java.util.Arrays.fill(sobelKernel, 0);
    for (int i = 1; i <= size; i++) {
        sobelKernel[((length / 2) - i)] = -i;
        sobelKernel[((length / 2) + i)] = i;
    }
    return sobelKernel;
}