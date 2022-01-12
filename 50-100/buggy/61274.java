private void filterAndRefresh() {
    if (((radioGroupLevelSelection) == (-1)) || ((radioGroupAreaSelection) == null)) {
        showToast("Pick a selection for area And level!");
        return ;
    }
    filteredCollection = alloc.filter();
    if ((filteredCollection) != null) {
        refreshListView(filteredCollection);
    }else {
        showToast("Not enough referees for a match with the specified options!");
    }
}