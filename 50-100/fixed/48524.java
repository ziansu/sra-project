private double[] bp(double[] errorGradient) {
    for (int i = (layers.size()) - 1; i >= 0; i--) {
        errorGradient = layers.get(i).errorGradient(errorGradient);
    }
    return errorGradient;
}