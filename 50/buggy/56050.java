synchronized void updatePageLoadingTime(final float pageLoadTime) {
    currentViewTracker.updatePageLoadingTime(pageLoadTime);
    pingParams.addOneTimeParameter(QueryKeys.PAGE_LOAD_TIME);
    pingManager.alive();
}