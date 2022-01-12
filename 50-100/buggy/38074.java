public static double[] create(int numberOfWeights) {
    double[] weights = new double[numberOfWeights];
    for (int i = 0; i < (weights.length); i++) {
        weights[i] = logic.CreateWeights.randomDouble(logic.CreateWeights.RANGE);
    }
    return weights;
}