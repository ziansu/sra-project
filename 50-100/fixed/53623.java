public void updateLocation(android.location.Location location) {
    if ((startLocation) == null) {
        startLocation = location;
        currentLocation = location;
        currentDistance = new com.illotus.dgd.Drive(0);
    }else {
        currentLocation = location;
        currentDistance.update(startLocation, currentLocation);
        currentLocationIsStartingLocation = false;
    }
    setChanged();
    notifyObservers();
}