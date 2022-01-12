public java.util.List<com.google.samples.apps.ibeaconapp.beaconinterface.IBeacon> getIBeacons() {
    java.util.Collections.sort(iBeacons);
    return iBeacons;
}