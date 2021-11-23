public com.wasteofplastic.beaconz.Region getRegion(double x, double z) {
    com.wasteofplastic.beaconz.Region region = null;
    if ((regions) != null) {
        for (com.wasteofplastic.beaconz.Region reg : regions.values()) {
            if (reg.containsPoint(x, z)) {
                region = reg;
                break;
            }
        }
    }
    return region;
}