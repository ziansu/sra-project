@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem item) {
    kat.android.com.movielist.MovieListActivity.drawerResult.setSelection(kat.android.com.movielist.MovieListActivity.TOP_RATED_FRAGMENT);
    showFragment(kat.android.com.movielist.MovieListActivity.TOP_RATED_FRAGMENT);
    return true;
}