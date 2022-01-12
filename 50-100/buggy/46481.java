public void onLoadFinish(java.util.List<T> list, int total, int pageSize) {
    if (pageSize > 0) {
        this.mPageSize = pageSize;
    }
    if (total > 0) {
        this.mTotalCount = total;
    }
    setAdapterData(list);
    calcCurrentPage();
    boolean enable = hasMoreData();
    refreshLayout.setEnableLoadMore(enable);
    if (!enable) {
        setFooterEmpty(null);
    }else {
        resetFooter();
    }
    refreshLayout.onRefreshComplete();
}