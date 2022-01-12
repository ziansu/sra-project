public void add(int cache, int latency) {
    cache_point.put(cache, ((distance_to_datacenter) - latency));
}