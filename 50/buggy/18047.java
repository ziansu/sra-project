@java.lang.Override
public void onGetMovieTrailersSuccess(java.util.List<udacity.winni.popsmovie.presentation.model.MovieTrailerVM> movieTrailerVMs) {
    rlMovieDetailFailed.setVisibility(View.GONE);
    rlMovieDetailSuccess.setVisibility(View.VISIBLE);
    movieTrailerAdapter.resetData(movieTrailerVMs);
}