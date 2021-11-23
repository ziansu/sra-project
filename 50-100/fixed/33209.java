public static double[][] softThreshold(double[][] input, double threshold) {
    double[][] output = new double[input.length][];
    for (int y = 0; y < (input.length); y++) {
        output[y] = io.github.guiritter.wavelet.Math.softThreshold(input[y], threshold);
    }
    return output;
}