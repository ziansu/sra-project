@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    search(query);
    clearFocus(mSearchView);
    return true;
}