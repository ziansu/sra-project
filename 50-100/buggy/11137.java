public org.matsim.contrib.zone.Zone getZone(org.matsim.contrib.zone.Coord coord) {
    int r = ((int) (java.lang.Math.round((((coord.getY()) - (minY)) / (cellSize)))));
    int c = ((int) (java.lang.Math.round((((coord.getX()) - (minX)) / (cellSize)))));
    return zones[((r * (cols)) + c)];
}