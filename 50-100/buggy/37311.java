private void metricMarkCacheHit(final com.alexremedios.subredditfinderservice.RequestMetadata requestMetadata) {
    if (requestMetadata == null) {
        return ;
    }
    cacheHitsMetric.mark();
    final com.codahale.metrics.Meter guidCacheHitsMetric = metrics.meter(java.lang.String.format("%s.%s", com.alexremedios.subredditfinderservice.SubmissionController.CACHE_HITS_METRIC, requestMetadata.getGuid()));
    guidCacheHitsMetric.mark();
}