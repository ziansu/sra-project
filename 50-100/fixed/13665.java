public com.wasteofplastic.beaconz.Region getRegion(int x, int z) {
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