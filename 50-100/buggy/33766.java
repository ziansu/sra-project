public java.util.List<at.fh.swenga.dao.MovieModel> searchMovies(java.lang.String searchString) {
    info.movito.themoviedbapi.model.core.MovieResultsPage result = tmdbSearch.searchMovie(searchString, null, "en-US", false, null);
    java.util.List<info.movito.themoviedbapi.model.MovieDb> resultList = result.getResults();
    java.util.List<at.fh.swenga.dao.MovieModel> movieModelList = new java.util.ArrayList<at.fh.swenga.dao.MovieModel>();
    for (info.movito.themoviedbapi.model.MovieDb mDB : resultList) {
        movieModelList.add(mapMovie(tmdbMovies, mDB.getId()));
    }
    return movieModelList;
}