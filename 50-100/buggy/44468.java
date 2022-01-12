private double sigmoid(double[] inputs, double[] weights) {
    double value = 0.0;
    for (int i = 0; i < (weights.length); i++) {
        value += (weights[i]) * (inputs[i]);
    }
    return 1.0 / (1.0 + (org.encog.mathutil.BoundMath.exp(((-1) * value))));
}