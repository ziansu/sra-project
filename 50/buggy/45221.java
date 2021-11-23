private void startLoadMore() {
    if ((mRecyclerViewListener) != null) {
        recyclerViewFooter.setState(LFRecyclerViewFooter.STATE_LOADING);
        mRecyclerViewListener.onLoadMore();
    }
}