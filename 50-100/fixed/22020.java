@java.lang.Override
public void onResponse(com.example.vineetpatil.moviesearch.SearchResponse response) {
    if (((response.getTotalResults()) > 0) && ((response.getSearch()) != null)) {
        for (com.example.vineetpatil.moviesearch.SearchResponse.SearchResult searchResult : response.getSearch()) {
            getDetails(searchResult.getImdbID());
        }
    }
    this.loadingData = false;
}