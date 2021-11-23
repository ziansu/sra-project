public static double[] softThreshold(double[] input, double threshold) {
    double[] output = new double[input.length];
    for (int i = 0; i < (input.length); i++) {
        output[i] = io.github.guiritter.wavelet.Math.softThreshold(input[i], threshold);
    }
    return output;
}