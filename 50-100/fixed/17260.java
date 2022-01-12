private void completeRefresh(java.util.List<?> items) {
    if (items == null) {
        mSmartRefreshLayout.finishRefresh();
        closeRefreshAndLoadMore();
        showEmptyMessage(mAdapter);
    }else {
        setItems(items);
        mSmartRefreshLayout.setLoadmoreFinished(enableFinishLoadMore(items.size()));
        mSmartRefreshLayout.finishRefresh();
    }
}