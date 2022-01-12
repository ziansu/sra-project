@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    com.loopj.android.http.AsyncHttpClient client = new com.loopj.android.http.AsyncHttpClient();
    adapter.clear();
    com.loopj.android.http.RequestParams params = getParams();
    params.put("page", 0);
    params.put("q", query);
    boolean isConnected = checkConnection();
    if (isConnected) {
        client.get(com.drishi.nytimessearch.activities.SearchActivity.URL, params, requestHandler);
        searchView.clearFocus();
    }
    return true;
}