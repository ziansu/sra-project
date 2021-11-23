@java.lang.Override
public void onScrollStateChanged(android.support.v7.widget.RecyclerView recyclerView, int newState) {
    super.onScrollStateChanged(recyclerView, newState);
    if ((newState == (android.support.v7.widget.RecyclerView.SCROLL_STATE_IDLE)) && (((lastVisibleItem) + 1) == (mAdapter.getItemCount()))) {
        mPresenter.loadNews(((mPage) + 1), mCategory, false);
    }
}