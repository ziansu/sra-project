protected void releaseCachedContainerBaubles() {
    synchronized(cachedContainerBaubles) {
        cachedContainerBaubles = null;
    }
}