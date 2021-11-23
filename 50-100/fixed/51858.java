public static java.util.ArrayList<lania.edu.mx.popularmovies.tos.Movie> toModel(lania.edu.mx.popularmovies.tos.MovieResponse response) {
    java.util.ArrayList<lania.edu.mx.popularmovies.tos.Movie> movies = new java.util.ArrayList<lania.edu.mx.popularmovies.tos.Movie>();
    for (lania.edu.mx.popularmovies.tos.lania.edu.mx.popularmovies.tos.Movie movie : response.getMovies()) {
        movies.add(lania.edu.mx.popularmovies.tos.MovieConverter.toModel(movie));
    }
    return movies;
}