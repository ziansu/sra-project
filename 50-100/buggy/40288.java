private java.util.Set<pilot.general.Location> getNonZeroDemandLocations() {
    java.util.Set<pilot.general.Location> locs = new java.util.LinkedHashSet<>();
    for (pilot.general.Location loc : instance.getLocations()) {
        if ((instance.getData().getDemand(loc)) > 0)
            locs.add(loc);
        
    }
    return locs;
}