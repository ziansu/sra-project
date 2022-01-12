synchronized void draw() {
    if (((mAllSongHistoryList) == null) || ((mAdapter) == null)) {
        return ;
    }
    mAllSongHistoryList = mSongHistoryController.getManagedTimeline(mRealm);
    mItemList = createItemList(0, 30);
    mAdapter.updateDataSet(mItemList);
    if ((mLoading) != null) {
        mLoading.setVisibility(View.INVISIBLE);
    }
}