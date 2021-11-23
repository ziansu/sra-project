@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    poiSearchAdapter.filterData(newText);
    expandAll();
    return false;
}