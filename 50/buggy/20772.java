private appservweb.isilm.beaconguide.Beacon selectDestBeacon(java.lang.String search) {
    for (appservweb.isilm.beaconguide.Beacon beac : beacons) {
        if ((beac.getZona()) == search) {
            return beac;
        }
    }
    return null;
}