private void favoriteSelection() {
    if (mMovieFavorite) {
        mListener.removeMovieFromFavorites();
    }else {
        mListener.setMovieAsFavorite();
    }
}