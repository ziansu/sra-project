public boolean needsRefresh() {
    boolean needsRefresh;
    this.refreshLock.readLock().lock();
    if ((this.expires) < 0) {
        needsRefresh = false;
    }else {
        long now = java.lang.System.currentTimeMillis();
        long tokenDuration = now - (this.lastRefresh);
        needsRefresh = tokenDuration >= ((this.expires) - (com.box.sdk.BoxAPIConnection.REFRESH_EPSILON));
    }
    this.refreshLock.readLock().unlock();
    return needsRefresh;
}