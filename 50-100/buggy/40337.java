private void handleIntent(android.content.Intent intent) {
    swipeView.setRefreshing(true);
    switch (intent.getAction()) {
        case android.content.Intent.ACTION_SEARCH :
            recyclerView.scrollToPosition(0);
            swipeView.scrollTo(0, 0);
            searchQuery = intent.getStringExtra(SearchManager.QUERY);
            actionBar.setSubtitle(searchQuery);
            postList.searchTags(searchQuery);
            if ((searchViewItem) != null) {
                searchViewItem.collapseActionView();
            }
            break;
        default :
            postList.searchTags("");
            break;
    }
}