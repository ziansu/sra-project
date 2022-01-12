private java.util.List<GoogleTaskForce.BasicObjects.Cache> fittingCache(GoogleTaskForce.BasicObjects.Video video) {
    java.util.List<GoogleTaskForce.BasicObjects.Cache> caches = new java.util.ArrayList<>();
    for (GoogleTaskForce.BasicObjects.Cache cache : caches) {
        if (cache.videoFit(video))
            caches.add(cache);
        
    }
    return caches;
}