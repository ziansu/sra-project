@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    poiSearchAdapter.filterData(query);
    expandAll();
    return false;
}