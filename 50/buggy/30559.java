@java.lang.Override
public boolean onQueryTextChange(java.lang.String s) {
    android.util.Log.d("MovieListActivity", "Search Text Change");
    if ((s.length()) > 2) {
        onQueryTextSubmit(s);
    }
    return false;
}