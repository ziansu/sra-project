private boolean areEqual(java.util.List<husaynhakeem.io.popularmovies.models.Movie> movies, java.util.List<husaynhakeem.io.popularmovies.models.Movie> moviesToCompare) {
    if (moviesToCompare == null) {
        return movies == null;
    }
    return !(((movies.size()) != (moviesToCompare.size())) || (!(moviesToCompare.containsAll(movies))));
}