private java.util.List<com.croitorivan.cacheableobserver.observer.Observer> getObserver(com.croitorivan.cacheableobserver.util.EventContext key) {
    java.util.List<com.croitorivan.cacheableobserver.observer.Observer> observersToReturn = new java.util.ArrayList<>();
    for (com.croitorivan.cacheableobserver.observer.Observer next : observers) {
        final java.util.List<com.croitorivan.cacheableobserver.util.EventContext> observerKeys = next.getObserverKeys();
        if (observerKeys.contains(key)) {
            observersToReturn.add((next.isMainObserverForKey(key) ? observersToReturn.size() : 0), next);
        }
    }
    return observersToReturn;
}