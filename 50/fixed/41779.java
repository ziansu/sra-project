@java.lang.Override
public int compareTo(com.google.samples.apps.ibeaconapp.beaconinterface.IBeacon another) {
    return (another.getRssi()) < (rssi) ? -1 : (rssi) == (another.getRssi()) ? 0 : 1;
}