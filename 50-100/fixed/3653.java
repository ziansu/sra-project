@java.lang.Override
public org.elasticsearch.search.aggregations.InternalAggregation buildAggregation(final long bucket) {
    if (((this.valuesSources) == null) || (bucket >= (this.samplings.size()))) {
        return buildEmptyAggregation();
    }
    return new org.scaleborn.elasticsearch.linreg.aggregation.stats.InternalStats(this.name, ((this.valuesSources.fieldNames().length) - 1), this.samplings.get(bucket), null, pipelineAggregators(), metaData());
}