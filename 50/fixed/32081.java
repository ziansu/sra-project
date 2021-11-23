private void sortByLocations(android.location.Location userLocation) {
    if ((userLocation != null) && ((adapter) != null)) {
        adapter.sortByLocation(userLocation);
    }
}