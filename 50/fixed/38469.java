private void addMarkersToMap(com.paranoidandroid.journey.models.Journey journey) {
    getMapViewFragment().addMarkersFromLegs(journey.getLegs(), 0);
}