public double variance(double[] dataset) {
    double degreeOfFreedom = (dataset.length) - 1;
    double var = 0;
    double mean = mean(dataset);
    for (int i = 0; i < (dataset.length); i++) {
        var += java.lang.Math.pow(((dataset[i]) - mean), 2);
    }
    var /= degreeOfFreedom;
    return var;
}