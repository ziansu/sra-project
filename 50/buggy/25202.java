private void favoriteSelection() {
    if (mMovieFavorite) {
        mFavoriteFab.setImageResource(R.drawable.ic_star_white_24dp);
        mListener.removeMovieFromFavorites();
    }else {
        mFavoriteFab.setImageResource(R.drawable.ic_star_border_white_24dp);
        mListener.setMovieAsFavorite();
    }
    mMovieFavorite = !(mMovieFavorite);
}