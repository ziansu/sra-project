@java.lang.Override
public void onSuccess(treehousecareerprojects.readie.http.HttpResponse response) {
    progressBar.setVisibility(View.GONE);
    java.util.List<treehousecareerprojects.readie.model.SearchResult> searchResults = new java.util.ArrayList<>();
    try {
        org.json.JSONObject json = new org.json.JSONObject(response.getResponseBody());
        searchResults = treehousecareerprojects.readie.json.SearchResponseParser.extractSearchResults(json);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    setListAdapter(new treehousecareerprojects.readie.adapter.SearchResultAdapter(this, searchResults));
}