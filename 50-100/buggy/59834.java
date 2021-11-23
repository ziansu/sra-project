public void refreshComplete(int pageSize) {
    this.mPageSize = pageSize;
    if (mRefreshing) {
        isNoMore = false;
        mRefreshHeader.refreshComplete();
        mRefreshing = false;
        if ((mWrapAdapter.getInnerAdapter().getItemCount()) < pageSize) {
            mFootView.setVisibility(com.github.jdsjlzx.recyclerview.GONE);
        }
    }else
        if (mLoadingData) {
            mLoadingData = false;
            mLoadMoreFooter.onComplete();
        }
    
}