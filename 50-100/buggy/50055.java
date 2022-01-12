@java.lang.Override
public void onFavoriteButtonClicked() {
    if (mIsFavorite) {
        if (mMoviesRepository.unsetMovieAsFavorite(mMovie.getId())) {
            mMovieDetailView.updateFavoriteButton(false);
        }
    }else {
        if (mMoviesRepository.setMovieAsFavorite(mMovie.getId(), mMovie.getTitle())) {
            mMovieDetailView.updateFavoriteButton(true);
        }
    }
}