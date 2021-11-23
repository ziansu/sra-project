public void completeLoadMore() {
    if (null != (mOnScrollListener))
        mOnScrollListener.setLoading(false);
    
    if (null != (mAdapter))
        mAdapter.setFooterStatus(EndlessAdapter.FooterStatus.GONE);
    
}