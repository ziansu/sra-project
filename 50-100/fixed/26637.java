protected static double distanceNode(eu.j3t.gps.GPSMapNode node1, eu.j3t.gps.GPSMapNode node2) {
    int xDifference = (node1.getX()) - (node2.getX());
    int yDifference = (node1.getY()) - (node2.getY());
    int zDifference = (node1.getZ()) - (node2.getZ());
    return java.lang.Math.sqrt((((xDifference * xDifference) + (yDifference * yDifference)) + (zDifference * zDifference)));
}