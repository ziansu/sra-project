public void autoLoad(int dy) {
    int lastVisibleItem = ((android.support.v7.widget.LinearLayoutManager) (mRecyclerView.getLayoutManager())).findLastVisibleItemPosition();
    int totalCount = mAdapter.getItemCount();
    if ((((!(mModel.isLoading())) && (totalCount > 0)) && (dy > 0)) && (lastVisibleItem >= (totalCount - 3))) {
        mModel.setLoading(true);
        mPresenter.load(mModel.getAuthorId());
    }
}