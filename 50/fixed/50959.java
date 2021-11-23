public double probability(int featureIndex) {
    if (featureIndex >= (values.length)) {
        return 0.0;
    }
    return values[featureIndex];
}