public java.util.ArrayList<lilium.arubabacon.iBeacon> cloneUnplaced() {
    synchronized(placedBeacons) {
        return unplacedBeacons;
    }
}