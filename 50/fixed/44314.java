protected int GetFetchedNumber() {
    return mForceGetList ? mList.size() : mFetched;
}