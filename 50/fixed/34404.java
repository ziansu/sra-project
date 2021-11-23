protected void addFailureCount(int itemID) {
    int i = fetchAttemptCount(itemID).incrementAndGet();
    if (i >= (options.getAttemptCount())) {
        notifyFailedFetch(itemID);
    }
}