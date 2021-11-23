@java.lang.Override
public void refreshMovieList() {
    mLoadManager.restartLoader(com.manpdev.androidnanodegree.popularmov.movie.movielist.MovieList.MOVIE_LOADER_ID, null, this);
}