@java.lang.Override
public void loadMoreFinish(boolean emptyResult, boolean hasMore) {
    mLoadError = false;
    mListEmpty = emptyResult;
    mIsLoading = false;
    mHasMore = hasMore;
    if ((mLoadMoreUIHandler) != null) {
        mLoadMoreUIHandler.onLoadFinish(this, emptyResult, hasMore);
    }
    if ((mFooterView) != null) {
        if (hasMore) {
            mFooterView.setVisibility(com.being.base.ui.widget.ptr.loadmore.VISIBLE);
        }else {
            mFooterView.setVisibility(com.being.base.ui.widget.ptr.loadmore.GONE);
        }
    }
}