public void getFavouriteMovies() {
    if (!(mPbMovieList.isShown())) {
        mPbMovieList.show();
    }
    mMovieFavouritePresenterImp.getFavouriteMovies(this);
}