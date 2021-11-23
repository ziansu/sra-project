private void handleIntent(android.content.Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        java.lang.String query = intent.getStringExtra(SearchManager.QUERY);
        wikiViewer.passSearch(query);
        hideSearchView();
    }else
        if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            final java.lang.String url = intent.getDataString();
            wikiViewer.wikiClient.shouldOverrideUrlLoading(wikiViewer, url);
        }
    
}