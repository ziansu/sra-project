public void onImageSearch(int page, com.loopj.android.http.JsonHttpResponseHandler handler) {
    if (!(isNetworkAvailable())) {
        android.widget.Toast.makeText(this, "No network available...", Toast.LENGTH_SHORT).show();
        return ;
    }
    client.getImages(filter, queryString, page, handler);
}