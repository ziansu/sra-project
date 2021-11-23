@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    search.clearFocus();
    search.setIconified(true);
    return onQueryTextChange(query);
}