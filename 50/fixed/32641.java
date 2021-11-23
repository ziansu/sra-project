public synchronized void destroyAllAds() {
    mFetchFailCount = 0;
    mNoOfFetchedAds = 0;
    notifyObserversOfAdSizeChange((-1));
    mContext.clear();
}