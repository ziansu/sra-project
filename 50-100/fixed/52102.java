public double[] eval(double[] input, double drop_out_ratio, int maxOutk) {
    int nodeSize = input.length;
    double[] output = new double[nodeSize];
    for (int index = 0; index < nodeSize; index++) {
        output[index] = ((input[index]) >= 0) ? input[index] : (java.lang.Math.exp(input[index])) - 1.0;
    }
    return output;
}