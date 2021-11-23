private void handleIntent(android.content.Intent intent) {
    switch (intent.getAction()) {
        case android.content.Intent.ACTION_SEARCH :
            searchQuery = intent.getStringExtra(SearchManager.QUERY);
            actionBar.setSubtitle(searchQuery);
            postList.searchTags(searchQuery);
            break;
        default :
            postList.searchTags("");
            break;
    }
}