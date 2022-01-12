private void updateDetails() {
    new self.hideki.popularmovies.FetchReviewsTask(reviewAdapter).execute(movie.getId());
    new self.hideki.popularmovies.FetchVideoTask(trailerAdapter).execute(movie.getId());
    try {
        favorite = self.hideki.popularmovies.data.PopularMoviesDbHelper.isFavoriteMovie(getActivity(), movie.getId());
        updateFavoriteButton();
    } catch (java.lang.Exception e) {
        android.util.Log.w(self.hideki.popularmovies.DetailFragment.TAG, ("Error in PopularMoviesDbHelper.isFavoriteMovie(): " + (e.getMessage())), e);
    }
}