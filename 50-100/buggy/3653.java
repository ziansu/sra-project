@java.lang.Override
public org.elasticsearch.search.aggregations.InternalAggregation buildAggregation(long bucket) {
    if (((valuesSources) == null) || (bucket >= (samplings.size()))) {
        return buildEmptyAggregation();
    }
    return new org.scaleborn.elasticsearch.linreg.aggregation.stats.InternalStats(name, ((valuesSources.fieldNames().length) - 1), samplings.get(bucket), null, pipelineAggregators(), metaData());
}