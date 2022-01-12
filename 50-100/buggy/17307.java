private void getSearchResults(java.lang.String query) {
    if ((getSearchResultsTask) != null)
        getSearchResultsTask.cancel(true);
    
    getSearchResultsTask = new nl.jelletenbrinke.saxionroosters.extras.NetworkAsyncTask(this, this);
    java.lang.String url = ((nl.jelletenbrinke.saxionroosters.extras.S.URL) + (nl.jelletenbrinke.saxionroosters.extras.S.QUERY)) + query;
    getSearchResultsTask.execute(url, S.PARSE_SEARCH_RESULTS, query);
}