@java.lang.Override
protected void onPostExecute(java.util.List<com.cats.lisamariewatkins.popularmovies.Models.Movie> movies) {
    if (!(movies.isEmpty())) {
        showSuccessView();
        mMoviesAdapter.setMovies(movies);
    }else {
        showErrorView();
    }
}