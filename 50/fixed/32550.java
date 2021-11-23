@java.lang.Override
public org.elasticsearch.search.aggregations.InternalAggregation buildEmptyAggregation() {
    return new org.elasticsearch.search.aggregations.bucket.geoheatmap.InternalGeoHeatmap(name, gridLevel, 0, 0, 0, 0, 0, 0, new int[0], 0, buildEmptySubAggregations(), pipelineAggregators(), metaData());
}