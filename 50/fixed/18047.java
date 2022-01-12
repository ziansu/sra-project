@java.lang.Override
public void onGetMovieTrailersSuccess(java.util.List<udacity.winni.popsmovie.presentation.model.MovieTrailerVM> movieTrailerVMs) {
    this.movieTrailerVMs = movieTrailerVMs;
    rlMovieDetailFailed.setVisibility(View.GONE);
    rlMovieDetailSuccess.setVisibility(View.VISIBLE);
    movieTrailerAdapter.resetData(movieTrailerVMs);
}