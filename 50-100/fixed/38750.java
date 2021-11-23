private void autoScrollFinished(boolean autoScrollAbort) {
    if (mLoading) {
        if ((com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.isRefreshing(mStatus)) && (!autoScrollAbort)) {
            mRefreshCallback.onRefresh();
        }else
            if ((com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.isLoadingMore(mStatus)) && (!autoScrollAbort)) {
                mLoadMoreCallback.onLoadMore();
            }
        
    }
}