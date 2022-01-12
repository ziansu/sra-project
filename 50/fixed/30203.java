public boolean highlightStationFromNameForPage(java.lang.String stationName, int position) {
    return retrieveListFragment(position).highlightStationFromName(stationName);
}