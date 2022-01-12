private synchronized void doneLoading() {
    if (showingProgress) {
        getListView().removeFooterView(loadProgressView);
        showingProgress = false;
    }
    if ((currentPage) == (totalPages)) {
        getListView().addFooterView(nomoreDataView, null, false);
        showingNoMoreData = true;
    }else {
        getListView().addFooterView(loadButtonView, null, false);
        showingLoadButton = true;
    }
}