private double calcProbabilityTimesOccurrence(ch.bfh.bti7535.w2016.algorithm.features.AbstractFeature feature, ch.bfh.bti7535.w2016.data.Classification classification) {
    double probability = feature.getProbability(classification);
    double occurrence = 1.0;
    return probability * occurrence;
}