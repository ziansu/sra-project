public void resetStartLocationToCurrent() {
    startLocation = currentLocation;
    currentLocationIsStartingLocation = true;
    currentDistance = new com.illotus.dgd.Drive(0);
    setChanged();
    notifyObservers();
}