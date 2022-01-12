@java.lang.Override
public void onFavoriteButtonClicked() {
    if (mIsFavorite) {
        if (mMoviesRepository.unsetMovieAsFavorite(mMovie.getId())) {
            mMovieDetailView.updateFavoriteButton(false);
            mIsFavorite = false;
        }
    }else {
        if (mMoviesRepository.setMovieAsFavorite(mMovie.getId(), mMovie.getTitle())) {
            mMovieDetailView.updateFavoriteButton(true);
            mIsFavorite = true;
        }
    }
}