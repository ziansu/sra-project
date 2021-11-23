@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    searchView.clearFocus();
    searchView.getQuery().toString().trim();
    isConected(query);
    return true;
}