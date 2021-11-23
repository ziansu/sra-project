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
    restartLoader(true);
    if ((mAdapter) != null) {
        mAdapter.notifyDataSetChanged();
    }
}