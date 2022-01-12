private void getFavouriteData() {
    detailType = com.example.popularmovies.activity.MainActivity.DetailType.FAVOURITE;
    com.example.popularmovies.datamodel.MovieDao movieDao = ((com.example.popularmovies.application.PopularMoviesApplication) (getApplication())).getDaoSession().getMovieDao();
    java.util.List<com.example.popularmovies.datamodel.Movie> list = movieDao.queryBuilder().list();
    updateFragment(new com.example.popularmovies.datamodel.searchResult.SearchResultMovie(movieDao.queryBuilder().list()));
}