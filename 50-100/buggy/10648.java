@java.lang.Override
public void onScrollStateChanged(android.support.v7.widget.RecyclerView recyclerView, int newState) {
    super.onScrollStateChanged(recyclerView, newState);
    int initialItemCount = mGridLayoutManager.findFirstCompletelyVisibleItemPosition();
    int totalItemCount = mGridLayoutManager.getItemCount();
    int lastVisisbleItemPosition = mGridLayoutManager.findLastCompletelyVisibleItemPosition();
    mInfiniteScrollListener.loadMoreData(initialItemCount, totalItemCount, lastVisisbleItemPosition);
}