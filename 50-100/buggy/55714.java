private double[] applyWeight(double[] vector) {
    double[] result = new double[vector.length];
    for (int i = 0; i < (vector.length); i++) {
        result[i] = (vector[i]) + (getWeight());
    }
    return result;
}