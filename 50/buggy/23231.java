private boolean isExpired() {
    long cacheEntryAge = (java.lang.System.currentTimeMillis()) - (getCachedFile().lastModified());
    return (cacheEntryAge > (maxAgeMillis)) && (isOnline());
}