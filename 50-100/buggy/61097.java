public void initHistory() {
    mBackState = mState.deepCopy();
    mCanBackPaginate = true;
    mIsBackPaginating = false;
    mIsForewardPaginating = false;
    if (null != (mDataHandler.getDataRetriever())) {
        mDataHandler.getDataRetriever().cancelHistoryRequest(mRoomId);
    }
}