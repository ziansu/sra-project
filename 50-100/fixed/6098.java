@java.lang.Override
public void increase(java.lang.String apiKey) throws com.exercise.hotels.auth.RateLimitExceededException {
    long currMillis = java.lang.System.currentTimeMillis();
    checkSuspended(apiKey, currMillis);
    java.util.concurrent.atomic.AtomicLong newRequests = new java.util.concurrent.atomic.AtomicLong(0);
    java.util.concurrent.atomic.AtomicLong requests = requestForAPIKey.putIfAbsent(new com.exercise.hotels.auth.InMemoryRateLimitHandler.APIKeyTimeWindow(apiKey, currMillis), newRequests);
    if (requests == null) {
        requests = newRequests;
        cleanExpiredAPIKeyTimeWindows(currMillis);
    }
    long currentRequests = requests.incrementAndGet();
    suspendIfRateLimitExceeded(apiKey, currMillis, currentRequests);
}