@java.lang.Override
protected void onResume() {
    com.runnerapp.runnerapp.LocationCollection locationCollection = com.runnerapp.runnerapp.LocationCollection.getInstance();
    super.onResume();
    setUpMapIfNeeded();
    updateMapWithData();
    map.recenterMap(locationCollection.getMostRecentLocation());
}