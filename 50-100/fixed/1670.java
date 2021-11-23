@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    totalItemCount = gridLayoutManager.getItemCount();
    lastVisibleItem = gridLayoutManager.findLastVisibleItemPosition();
    if (((!(isLoading)) && ((totalItemCount) > 0)) && ((totalItemCount) <= ((lastVisibleItem) + (visibleThreshold)))) {
        if ((mOnLoadMoreListener) != null) {
            mOnLoadMoreListener.onLoadMore();
        }
        isLoading = true;
    }
}