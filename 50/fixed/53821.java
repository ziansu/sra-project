@java.lang.Override
protected void onPostExecute(java.util.ArrayList<fastrackm.nanodegree.udacity.abhis.popularmovies_s2.models.Movie> movieData) {
    if (movieData != null) {
        mAdapter.setMovieData(movieData);
    }else {
    }
}