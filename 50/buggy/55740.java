@java.lang.Override
public void newLocations(java.util.List<com.test.zumperproject.models.restaurant.Results> results) {
    this.results.addAll(results);
    addMarkers();
}