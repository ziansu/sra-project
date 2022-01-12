public static double[] create(int numberOfWeights) {
    double[] weights = new double[numberOfWeights];
    weights[0] = 1.0;
    for (int i = 1; i < (weights.length); i++) {
        weights[i] = logic.CreateWeights.randomDouble(logic.CreateWeights.RANGE);
    }
    return weights;
}