public synchronized void notifyChange(org.searsia.cache.RunningAvgTTLCache.CachedResult cachedResult) {
    if (results.containsKey(cachedResult)) {
        sum -= results.get(cachedResult);
        (count)--;
    }
    results.put(cachedResult, cachedResult.getEstimatedTTL());
    sum += cachedResult.getEstimatedTTL();
    (count)++;
    ttl = (sum) / (count);
    java.lang.System.out.println(("New estimated TTL=" + (ttl)));
    java.lang.System.out.println(this.toString());
}