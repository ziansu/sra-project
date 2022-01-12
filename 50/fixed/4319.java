private synchronized void showLoading() {
    if (showingLoadButton) {
        getListView().removeFooterView(loadButtonView);
        showingLoadButton = false;
    }
    getListView().addFooterView(loadProgressView, null, false);
    showingProgress = true;
}