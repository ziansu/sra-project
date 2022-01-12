protected double distanceNodeFromLocation(eu.j3t.gps.GPSMapNode node, org.bukkit.Location location) {
    int xDifference = (node.getX()) - (location.getBlockX());
    int yDifference = (node.getY()) - (location.getBlockY());
    int zDifference = (node.getZ()) - (location.getBlockZ());
    return java.lang.Math.sqrt((((xDifference * xDifference) + (yDifference * yDifference)) + (zDifference * zDifference)));
}