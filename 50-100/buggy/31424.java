private void handleIntent(android.content.Intent intent) {
    swipeView.setRefreshing(true);
    switch (intent.getAction()) {
        case android.content.Intent.ACTION_SEARCH :
            swipeView.scrollTo(0, 0);
            searchViewItem.collapseActionView();
            searchQuery = intent.getStringExtra(SearchManager.QUERY);
            actionBar.setSubtitle(searchQuery);
            postList.searchTags(searchQuery);
            break;
        default :
            postList.searchTags("");
            break;
    }
}