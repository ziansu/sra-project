public synchronized void deleteHistoryItem(java.lang.String url) {
    mLock = true;
    openIfNecessary();
    mLock = false;
}