@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(com.franktan.popularmovies.MoviesGridFragment.MOVIE_LOADER_ID, null, this);
    super.onActivityCreated(savedInstanceState);
}