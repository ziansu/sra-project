private synchronized void doneLoading() {
    if (showingProgress) {
        getListView().removeFooterView(loadProgressView);
        showingProgress = false;
    }
    if ((currentPage) == (totalPages)) {
        getListView().addFooterView(nomoreDataView);
        showingNoMoreData = true;
    }else {
        getListView().addFooterView(loadButtonView);
        showingLoadButton = true;
    }
}