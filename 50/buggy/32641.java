public synchronized void destroyAllAds() {
    mFetchFailCount = 0;
    mNoOfFetchedAds = 0;
    mContext.clear();
    notifyObserversOfAdSizeChange((-1));
}