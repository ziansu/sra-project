public java.util.ArrayList<info.movito.themoviedbapi.model.MovieDb> getPopularMovies(final int numOfPages) {
    info.movito.themoviedbapi.TmdbMovies tmdbMovies = edu.cis.CIS350.MovieDB.Movie.tmdbApi.getMovies();
    java.util.ArrayList<info.movito.themoviedbapi.model.MovieDb> popularMovies = new java.util.ArrayList<info.movito.themoviedbapi.model.MovieDb>();
    for (int i = 1; i <= numOfPages; i++) {
        info.movito.themoviedbapi.model.core.MovieResultsPage results = tmdbMovies.getPopularMovies("en", i);
        for (info.movito.themoviedbapi.model.MovieDb mov : results) {
            popularMovies.add(mov);
        }
    }
    return popularMovies;
}