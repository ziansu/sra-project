private void clearAdapterDataSet() {
    if (((mItemsData) != null) && ((mListAdapter) != null)) {
        mItemsData.clear();
        mListAdapter.swap(mItemsData);
    }
}