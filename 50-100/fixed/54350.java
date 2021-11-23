public dao.Movie getMovie(int id) {
    for (dao.Movie movie : dao.MovieListManager.movieList) {
        java.util.Optional<dao.Movie> nullableMovie = java.util.Optional.ofNullable(getMovieById(movie, id));
        if (nullableMovie.isPresent()) {
            return nullableMovie.get();
        }
    }
    return null;
}