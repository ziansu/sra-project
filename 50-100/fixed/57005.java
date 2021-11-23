@java.lang.Override
public void onClick(android.view.View v) {
    if ((isHasLoadMore) && (!(isLoadingMore()))) {
        mLoadState = LoadMoreView.LoadState.LOADING;
        if ((mOnLoadMoreListener) != null) {
            mOnLoadMoreListener.onLoadMore();
        }
        notifyItemChanged((((getHeaderViewItemCount()) + (getDataItemCount())) + (getFooterViewItemCount())));
    }
}