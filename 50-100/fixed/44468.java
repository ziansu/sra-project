private double sigmoid(double[] inputs, double[] weights) {
    double value = 0.0;
    for (int i = 0; i < (inputs.length); i++) {
        value += (weights[i]) * (inputs[i]);
    }
    value += (weights[inputs.length]) * 1.0;
    return 1.0 / (1.0 + (org.encog.mathutil.BoundMath.exp(((-1) * value))));
}