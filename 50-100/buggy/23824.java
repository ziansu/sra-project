@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    me.androidbox.busbymovies.di.DaggerInjector.getApplicationComponent().inject(this);
    if ((mMovieFavouritePresenterImp) != null) {
        timber.log.Timber.d("mMovieFavouritePresenterImp != null");
        mMovieFavouritePresenterImp.attachView(this);
        mMovieFavouritePresenterImp.getFavouriteMovies();
    }
    if ((mMovieListPresenterImp) != null) {
        timber.log.Timber.d("mMovieListPresenterImp != null");
        mMovieListPresenterImp.attachView(this);
        getPopularMovies();
    }else {
        timber.log.Timber.e("mMovieListPresenterImp == null");
    }
}