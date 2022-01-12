@java.lang.Override
public void changeMovieSort(int pSortId) {
    if (((mCurrentMovieSortId) == 0) && ((mMoviesRepository.getMovie(0)) != null))
        return ;
    
    mCurrentMovieSortId = pSortId;
    mMoviesRepository.clearMoviesList();
    if (pSortId == (MoviesListContract.POPULAR_MOVIE)) {
        mView.getPopularMovies();
    }else
        if (pSortId == (MoviesListContract.FAVOURITE_MOVIE)) {
            mView.getFavouriteMovies();
        }else {
            mView.getTopRatedMovies();
        }
    
}