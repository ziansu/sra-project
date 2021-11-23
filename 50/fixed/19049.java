@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((moviesGridAdapter) != null) {
        outState.putParcelableArrayList(abhi.com.popularmovies.ui.fragment.MovieListFragment.MOVIESTATE, new java.util.ArrayList<android.os.Parcelable>(moviesGridAdapter.getItems()));
    }
    super.onSaveInstanceState(outState);
}