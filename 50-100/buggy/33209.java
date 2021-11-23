public static double[][] softThreshold(double[][] input, double threshold) {
    for (int y = 0; y < (input.length); y++) {
        input[y] = io.github.guiritter.wavelet.Math.softThreshold(input[y], threshold);
    }
    return input;
}