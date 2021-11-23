public java.util.List<info.movito.themoviedbapi.model.MovieDb> discoverMovies() {
    info.movito.themoviedbapi.TmdbDiscover discover = tmdbApi.getDiscover();
    info.movito.themoviedbapi.model.core.MovieResultsPage page = discover.getDiscover(0, null, "popularity.desc", false, 2016, 2016, 0, 0, "28|21|16|99|53|27|36", "2016-01-01", "2018-01-01", null, null, null);
    java.util.List<info.movito.themoviedbapi.model.MovieDb> results = page.getResults();
    for (int i = 0; i < (results.size()); i++) {
    }
    return results;
}