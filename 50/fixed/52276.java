@java.lang.Override
public synchronized void onLoadMore() {
    loading = true;
    movieListAdapter.add(getMovies(((currentPgNo) + 1)));
    loading = false;
}