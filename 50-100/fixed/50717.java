public void onImageSearch(int page) {
    if ((queryString) == null)
        return ;
    
    if (!(isNetworkAvailable())) {
        android.widget.Toast.makeText(this, "No network available...", Toast.LENGTH_SHORT).show();
        return ;
    }
    client.getImages(filter, queryString, page, handler);
}