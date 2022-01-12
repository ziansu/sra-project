synchronized void updatePageLoadingTime(final float pageLoadTime) {
    currentViewTracker.updatePageLoadingTime(pageLoadTime);
    pingManager.alive();
}