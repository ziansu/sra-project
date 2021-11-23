@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    mRecyclerView.setVisibility(View.VISIBLE);
    if (s != null) {
        try {
            java.util.ArrayList<java.lang.String> l = mMoviesList.parseJSONImage();
            mMoviesAdapter = new com.example.anant.moviesdb.MoviesAdapter(l.size(), l);
            mRecyclerView.setAdapter(mMoviesAdapter);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        mProgress.setVisibility(View.INVISIBLE);
    }
    super.onPostExecute(s);
}