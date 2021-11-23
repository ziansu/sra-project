private void completeRefresh(java.util.List<?> items) {
    if (items == null) {
        mSmartRefreshLayout.finishRefresh();
        closeRefreshAndLoadMore();
        showEmptyMessage(mAdapter);
    }else {
        setItems(items);
        boolean enableLoadingMore = enableFinishLoadMore(items.size());
        mSmartRefreshLayout.setEnableLoadmore((!enableLoadingMore));
        mSmartRefreshLayout.setLoadmoreFinished(enableLoadingMore);
        mSmartRefreshLayout.finishRefresh();
    }
}