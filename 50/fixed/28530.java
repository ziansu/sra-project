private void updateMapWithData() {
    com.runnerapp.runnerapp.LocationCollection locationCollection = com.runnerapp.runnerapp.LocationCollection.getInstance();
    drawMapPoints(locationCollection.getLocationsToProcess());
}