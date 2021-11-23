private void search(java.lang.String searchQuery, int pageNumber) {
    searchResultAdapter.clear();
    requestQueue.cancelAll(com.example.vineetpatil.moviesearch.SearchFragment.TAG);
    java.lang.String url = java.lang.String.format(com.example.vineetpatil.moviesearch.SearchFragment.searchUrl, searchQuery, pageNumber);
    android.util.Log.d(com.example.vineetpatil.moviesearch.SearchFragment.TAG, ("search : url - " + url));
    com.example.vineetpatil.moviesearch.GsonRequest<com.example.vineetpatil.moviesearch.SearchResponse> searchResponseGsonRequest = new com.example.vineetpatil.moviesearch.GsonRequest(url, com.example.vineetpatil.moviesearch.SearchResponse.class, null, new com.example.vineetpatil.moviesearch.SearchFragment.SearchResultsListener(), new com.example.vineetpatil.moviesearch.SearchFragment.SearchResultsErrorListener());
    searchResponseGsonRequest.setTag(com.example.vineetpatil.moviesearch.SearchFragment.TAG);
    requestQueue.add(searchResponseGsonRequest);
    loadingData = true;
}