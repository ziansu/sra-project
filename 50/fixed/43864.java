@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    performFilter(newText);
    return false;
}