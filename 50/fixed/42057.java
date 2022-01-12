@java.lang.Override
public boolean onClose() {
    poiSearchAdapter.filterData("");
    search.setQuery("", false);
    search.clearFocus();
    return false;
}