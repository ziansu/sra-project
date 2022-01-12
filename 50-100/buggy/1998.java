private void updateMyCurrentLoc(android.location.Location location) {
    if (location != null) {
        android.location.Address addr = getAddrCurrentLocation(location.getLatitude(), location.getLongitude());
        java.lang.String name = addr.getAddressLine(0);
        moveCameraTo(location.getLatitude(), location.getLongitude());
        curPlace = name;
        curAddr = addr;
    }
}