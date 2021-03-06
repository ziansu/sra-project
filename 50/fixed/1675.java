public static double getExponentialMultiplier() {
    double value = neuralNet.Util.random.nextDouble();
    if (value == 0) {
        return 0;
    }
    value = (1 / value) - 1;
    return neuralNet.Util.random.nextBoolean() ? value : -value;
}