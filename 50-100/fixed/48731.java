public synchronized void notifyChange(org.searsia.cache.RunningAvgTTLCache.CachedResult cachedResult) {
    if (results.containsKey(cachedResult)) {
        sum -= results.get(cachedResult);
        (count)--;
    }
    results.put(cachedResult, cachedResult.getEstimatedTTL());
    sum += cachedResult.getEstimatedTTL();
    (count)++;
    ttl = (sum) / (count);
}