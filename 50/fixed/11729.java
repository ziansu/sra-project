public void onImageSearch(android.view.View v) {
    java.lang.String query = searchView.getQuery().toString();
    fetchSearchResults(query, 0, true);
}