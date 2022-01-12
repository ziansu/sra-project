public void getPosters(java.lang.String path) {
    MainMoviePosters.clear();
    if ((mRecyclerAdapter) != null)
        mRecyclerAdapter.notifyDataSetChanged();
    
    java.net.URL url = com.example.android.popularmoviesapp.Utils.NetworkUtils.buildUrl(this, path);
    progressBar.setVisibility(View.VISIBLE);
    new com.example.android.popularmoviesapp.TMBDQuery(this, this).execute(url);
}