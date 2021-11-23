private void setCurrentLocation(android.location.Location loc) {
    if (isBetterLocation(loc, currentBestLocation)) {
        currentBestLocation = loc;
        locationsCount += 1;
    }
}