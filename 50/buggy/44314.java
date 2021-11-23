protected int GetFetchedNumber() {
    return (mFetched) > 0 ? mFetched : mForceGetList ? mList.size() : 0;
}