@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    PostID = result;
    if (result != null) {
        errorLayout.setVisibility(View.GONE);
        new com.clusterdev.malayalammemes.malayalammemes.Newsfeed.RequestID().execute();
    }else
        swipeRefreshLayout.setRefreshing(false);
    
    if ((PostID) == null) {
        errorLayout.setVisibility(View.VISIBLE);
        errorButton.setEnabled(true);
    }
}