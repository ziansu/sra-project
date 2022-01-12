public int nbCacheNotEmpty() {
    int i = 0;
    for (GoogleTaskForce.Cache cache : caches) {
        if (!(cache.isEmpty())) {
            i++;
        }
    }
    return i;
}