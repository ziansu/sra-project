public void setupExternal(me.leofontes.movies.Models.Movie m, boolean fromFavorite) {
    if ((movie) == null) {
        movie = m;
        fromFavoriteList = fromFavorite;
        if ((movie) != null) {
            populateFields(movie);
        }
        configureFragment();
    }
}