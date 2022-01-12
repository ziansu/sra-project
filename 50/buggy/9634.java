@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    mSearchText = newText;
    doSearch();
    return true;
}