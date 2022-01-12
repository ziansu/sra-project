@java.lang.Override
protected java.util.ArrayList<noh.android.moviemanager.models.Movie> doInBackground(java.lang.String... params) {
    android.util.Log.e(noh.android.moviemanager.adapters.MovieAsyncTaskLoader.TAG_MovieAsyncTaskLoader, noh.android.moviemanager.adapters.MovieAsyncTaskLoader.getJson(params));
    return ConvertJsontoMovieList(noh.android.moviemanager.adapters.MovieAsyncTaskLoader.getJson(params));
}