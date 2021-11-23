public void addBeaconDefenseBlock(org.bukkit.Location location, com.wasteofplastic.beaconz.BeaconObj beacon) {
    java.awt.geom.Point2D point = new java.awt.geom.Point2D.Double(location.getBlockX(), location.getBlockZ());
    defenseBlocks.put(point, beacon);
}