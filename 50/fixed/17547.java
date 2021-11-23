@java.lang.Override
public void setRssi(int rssi) {
    increaseVersion();
    this.rssi = rssi;
    this.distanceMeters = ucc.RssiUCC.getDistanceFromRssi(rssi);
}