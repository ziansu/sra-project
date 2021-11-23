@java.lang.Override
public int compareTo(com.google.samples.apps.ibeaconapp.beaconinterface.IBeacon another) {
    return (rssi) > (another.getRssi()) ? -1 : (rssi) == (another.getRssi()) ? 1 : 0;
}