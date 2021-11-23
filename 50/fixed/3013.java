public void doCacheRelevant(final int textNo) {
    if (textNo > 0) {
        new org.lindev.androkom.TextFetcher.CacheRelevantTask().execute(textNo);
    }
}