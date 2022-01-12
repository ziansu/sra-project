public static double[] softThreshold(double[] input, double threshold) {
    for (int i = 0; i < (input.length); i++) {
        input[i] = io.github.guiritter.wavelet.Math.softThreshold(input[i], threshold);
    }
    return input;
}