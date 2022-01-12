private static double[] extractOutput(org.nd4j.linalg.api.ndarray.INDArray output, int length) {
    double[] result = new double[length];
    for (int i = 0; i < length; i++) {
        result[i] = output.getDouble(i);
    }
    return result;
}