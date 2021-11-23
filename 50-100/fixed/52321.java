private double variance(double[] array, double mean, int nElem) {
    double discrepancy = 0;
    double sum = 0;
    for (int i = 0; i < nElem; i++) {
        discrepancy = 0;
        discrepancy = (array[i]) - mean;
        sum += discrepancy * discrepancy;
    }
    return sum / (100 - 1);
}