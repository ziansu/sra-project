public double[] centre() {
    if (!(isValid())) {
        return null;
    }
    double[] center = new double[min.length];
    for (int i = 0; i < (min.length); i++) {
        center[i] = centre(i);
    }
    return center;
}