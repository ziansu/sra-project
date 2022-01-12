protected double calculateIncomingTokenPower(java.lang.Object newWeight, int index, double diminishingFactor, boolean isBmu) {
    java.lang.Double value = weightFuzzySets[index].get(newWeight);
    if (value == null) {
        value = 0.0;
    }
    value += diminishingFactor / (sampleFrequencies[index].get(newWeight));
    return value;
}