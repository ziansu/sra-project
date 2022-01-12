private int calculateGain(int i, int j) {
    int gain = 0;
    com.github.andone.solution.Cache cache = caches.get(j);
    for (com.github.andone.solution.Endpoint endpoint : cache.getEndpoints()) {
        com.github.andone.solution.Video video = videos.get(i);
        java.lang.Integer numOfVideoRequests = endpoint.getVideoRequests(video);
        java.lang.Integer endpointCacheLatency = endpoint.getCacheLatency(cache);
        if (numOfVideoRequests == null) {
            continue;
        }
        gain += numOfVideoRequests * ((endpoint.getLatencyToDataCenter()) - endpointCacheLatency);
    }
    return gain;
}