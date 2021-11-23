public org.matsim.contrib.zone.Zone getZone(org.matsim.contrib.zone.Coord coord) {
    int r = ((int) (((coord.getY()) - (minY)) / (cellSize)));
    int c = ((int) (((coord.getX()) - (minX)) / (cellSize)));
    return zones[((r * (cols)) + c)];
}