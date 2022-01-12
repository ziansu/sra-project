private void filterAndRefresh() {
    if (((radioGroupLevelSelection) == (-1)) || ((radioGroupAreaSelection) == null)) {
        showToast("Pick a selection for area And level!");
        return ;
    }
    filteredCollection = alloc.filter();
    refreshListView(filteredCollection);
}