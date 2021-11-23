public void removeWay(org.openstreetmap.josm.plugins.JunctionChecker.datastructure.OSMWay way) {
    while (ways.values().remove(way));
}