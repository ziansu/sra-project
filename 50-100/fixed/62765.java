public void refresh() {
    if ((mListView) != null) {
        mListView.setSelection(0);
    }else
        if ((mGridView) != null) {
            mGridView.setSelection(0);
        }
    
    if ((mAdapter) != null) {
        mAdapter.clear();
    }
    restartLoader();
    if ((mAdapter) != null) {
        mAdapter.notifyDataSetChanged();
    }
}