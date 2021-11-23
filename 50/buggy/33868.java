@java.lang.Override
public int dryRuns(java.util.Map<java.lang.String, java.lang.Object> params) {
    return ((com.graphaware.test.performance.CacheConfiguration) (params.get("cache"))).needsWarmup() ? 50 : 5;
}