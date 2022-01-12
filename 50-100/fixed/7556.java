private void createPages() {
    if ((moviesView) == null) {
        moviesView = new husaynhakeem.io.popularmovies.features.movies.MoviesView();
        husaynhakeem.io.popularmovies.features.movies.MoviesPresenter moviesPresenter = new husaynhakeem.io.popularmovies.features.movies.MoviesPresenter();
        moviesView.setPresenter(moviesPresenter);
    }
    if ((favoritesView) == null) {
        favoritesView = new husaynhakeem.io.popularmovies.features.favorites.FavoritesView();
        husaynhakeem.io.popularmovies.features.favorites.FavoritesPresenter favoritesPresenter = new husaynhakeem.io.popularmovies.features.favorites.FavoritesPresenter();
        favoritesView.setPresenter(favoritesPresenter);
    }
}