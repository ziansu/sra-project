public java.util.ArrayList<lilium.arubabacon.iBeacon> cloneUnplaced() {
    synchronized(placedBeacons) {
        return new java.util.ArrayList<lilium.arubabacon.iBeacon>(unplacedBeacons);
    }
}