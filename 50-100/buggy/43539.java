@com.facebook.presto.operator.aggregation.CombineFunction
public static void combine(com.facebook.presto.bloomfilter.BloomFilterState state, com.facebook.presto.bloomfilter.BloomFilterState otherState) {
    com.facebook.presto.bloomfilter.BloomFilter bfState = com.facebook.presto.bloomfilter.BloomFilterAggregation.getOrCreateBloomFilter(state, BloomFilter.DEFAULT_BLOOM_FILTER_EXPECTED_INSERTIONS, BloomFilter.DEFAULT_BLOOM_FILTER_FALSE_POSITIVE_PERCENTAGE);
    com.facebook.presto.bloomfilter.BloomFilter bfOther = com.facebook.presto.bloomfilter.BloomFilterAggregation.getOrCreateBloomFilter(state, BloomFilter.DEFAULT_BLOOM_FILTER_EXPECTED_INSERTIONS, BloomFilter.DEFAULT_BLOOM_FILTER_FALSE_POSITIVE_PERCENTAGE);
    state.setBloomFilter(bfState.putAll(bfOther));
}