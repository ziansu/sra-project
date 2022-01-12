private void refreshContent() {
    swipeRefreshLayout.setRefreshing(true);
    setUpLocationsForMainScreen();
    swipeRefreshLayout.setRefreshing(false);
}