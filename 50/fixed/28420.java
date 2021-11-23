private double calculateGradient(double[] oldState, double[] newState) {
    return ((double) (evaluation_.evaluate(newState))) - ((double) (evaluation_.evaluate(oldState)));
}