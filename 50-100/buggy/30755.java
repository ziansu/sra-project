public static double[] predict(Jama.Matrix input, Jama.Matrix weights) {
    double[][] scores = input.times(weights).getArray();
    return java.util.Arrays.stream(scores).map(( n) -> (n[0]) > 0 ? 1.0 : 0.0).mapToDouble(java.lang.Double::doubleValue).toArray();
}