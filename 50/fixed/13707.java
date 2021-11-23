@java.lang.Override
public void onSuccess() {
    mMap.clear();
    moveMapToUserLocation(location, location.toString(), false);
    loadSBars(location);
}