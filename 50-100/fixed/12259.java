synchronized void draw() {
    if (((mAllSongHistoryList) == null) || ((mAdapter) == null)) {
        return ;
    }
    mAllSongHistoryList = mSongHistoryController.getManagedTimeline(mRealm);
    mItemList = createItemList(0, 30);
    if ((mLoading) != null) {
        mLoading.setVisibility(View.INVISIBLE);
    }
    mAdapter.updateDataSet(mItemList);
}