public java.util.ArrayList<edu.cis.CIS350.MovieDB.Movie> getPopularMovies(final int numOfPages) {
    info.movito.themoviedbapi.TmdbMovies tmdbMovies = edu.cis.CIS350.MovieDB.Movie.tmdbApi.getMovies();
    java.util.ArrayList<edu.cis.CIS350.MovieDB.Movie> popularMovies = new java.util.ArrayList<edu.cis.CIS350.MovieDB.Movie>();
    for (int i = 1; i <= numOfPages; i++) {
        info.movito.themoviedbapi.model.core.MovieResultsPage results = tmdbMovies.getPopularMovies("en", i);
        for (info.movito.themoviedbapi.model.MovieDb mov : results) {
            popularMovies.add(new edu.cis.CIS350.MovieDB.Movie(mov.getId()));
        }
    }
    return popularMovies;
}