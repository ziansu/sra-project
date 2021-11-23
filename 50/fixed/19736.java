@java.lang.Override
public boolean onQueryTextChange(java.lang.String query) {
    adapter.filter(query);
    addFooterHandler(query);
    return true;
}