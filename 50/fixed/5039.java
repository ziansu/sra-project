@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(com.example.jamie.popularmovies.fragments.MainMovieFragment.MAIN_MOVIE_LOADER, null, this);
    super.onActivityCreated(savedInstanceState);
}