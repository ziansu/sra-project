@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, org.json.JSONObject response) {
    com.codepath.instagram.InstagramCollection instagramCollection = new com.codepath.instagram.InstagramCollection(response);
    instagrams = instagramCollection.instagrams;
    adapter.clear();
    adapter.addAll(instagramCollection.instagrams);
    swipeContainer.setRefreshing(false);
}