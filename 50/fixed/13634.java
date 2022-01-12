@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.ArrayList<com.jasonbutwell.popularmovies.Model.MovieItemBasic>> loader, java.util.ArrayList<com.jasonbutwell.popularmovies.Model.MovieItemBasic> movieData) {
    com.jasonbutwell.popularmovies.Ui.LoadingIndicator.show(mBinding, false);
    mListener.onTaskComplete(movieData);
    com.jasonbutwell.popularmovies.BackgroundTask.TMDBLoader.isLoaded = true;
}