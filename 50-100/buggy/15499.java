public void getPosters(java.lang.String path) {
    if ((MainMoviePosters) != null)
        MainMoviePosters.clear();
    
    if ((mRecyclerAdapter) != null)
        mRecyclerAdapter.notifyDataSetChanged();
    
    mRecyclerAdapter = null;
    java.net.URL url = com.example.android.popularmoviesapp.Utils.NetworkUtils.buildUrl(this, path);
    progressBar.setVisibility(View.VISIBLE);
    new com.example.android.popularmoviesapp.TMBDQuery(this, this).execute(url);
}