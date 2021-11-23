private void populateMovieList() {
    int i = 0;
    info.movito.themoviedbapi.model.core.MovieResultsPage results;
    do {
        results = tmdbMovies.getNowPlayingMovies("en", (i++));
        for (info.movito.themoviedbapi.model.MovieDb movie : results.getResults()) {
            movieList.add(movie);
        }
    } while (i <= (NUM_PAGES) );
}