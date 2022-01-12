public void placeBeacon(lilium.arubabacon.iBeacon beacon) {
    if (unplacedBeacons.contains(beacon)) {
        placedBeacons.add(beacon);
        unplacedBeacons.remove(beacon);
    }
}