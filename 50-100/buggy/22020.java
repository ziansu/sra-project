@java.lang.Override
public void onResponse(com.example.vineetpatil.moviesearch.SearchResponse response) {
    android.util.Log.d(com.example.vineetpatil.moviesearch.SearchFragment.TAG, ("SearchResultsListener - onResponse : " + (response.toString())));
    if (((response.getTotalResults()) > 0) && ((response.getSearch()) != null)) {
        for (com.example.vineetpatil.moviesearch.SearchResponse.SearchResult searchResult : response.getSearch()) {
            getDetails(searchResult.getImdbID());
        }
    }
    this.loadingData = false;
}