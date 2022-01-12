public io.seldon.recommendation.ClientStrategy sample(java.lang.String userId) {
    java.lang.Integer hash = org.apache.mahout.math.MurmurHash.hash(userId.getBytes(), io.seldon.recommendation.VariationTestingClientStrategy.HASH_SEED);
    int sample = (java.lang.Math.abs((hash % 100))) + 1;
    java.math.BigDecimal sampleDec = java.math.BigDecimal.valueOf(sample).divide(java.math.BigDecimal.valueOf(100));
    for (org.apache.commons.lang.math.Range range : strategyMap.keySet()) {
        if (range.containsNumber(sampleDec)) {
            return strategyMap.get(range);
        }
    }
    return null;
}