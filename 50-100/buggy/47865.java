@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    if (s != null) {
        try {
            java.util.ArrayList<java.lang.String> l = mMoviesList.parseJSONImage();
            mMoviesAdapter = new com.example.anant.moviesdb.MoviesAdapter(l.size(), l);
            mRecyclerView.setAdapter(mMoviesAdapter);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        mRecyclerView.setVisibility(View.VISIBLE);
        mProgress.setVisibility(View.INVISIBLE);
    }
    super.onPostExecute(s);
}