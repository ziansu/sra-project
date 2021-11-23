private int calculateGain(int i, int j) {
    int gain = -1;
    com.github.andone.solution.Cache cache = caches.get(j);
    for (com.github.andone.solution.Endpoint endpoint : cache.getEndpoints()) {
        com.github.andone.solution.Video video = videos.get(i);
        java.lang.Integer numOfVideoRequests = endpoint.getVideoRequests(video);
        java.lang.Integer endpointCacheLatency = endpoint.getCacheLatency(cache);
        gain += numOfVideoRequests * ((endpoint.getLatencyToDataCenter()) - endpointCacheLatency);
    }
    return gain;
}