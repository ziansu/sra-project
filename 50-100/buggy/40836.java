public double[] centre() {
    if (!(isValid())) {
        return null;
    }
    double[] center = new double[min.length];
    for (int i = 0; i < (min.length); i++) {
        center[i] = ((min[i]) + (max[i])) / 2.0;
    }
    return center;
}