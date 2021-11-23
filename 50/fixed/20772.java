private appservweb.isilm.beaconguide.Beacon selectDestBeacon(java.lang.String search) {
    for (appservweb.isilm.beaconguide.Beacon beac : beacons) {
        if (beac.getZona().equals(search)) {
            return beac;
        }
    }
    return null;
}