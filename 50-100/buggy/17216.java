protected static boolean canWalkThru(org.bukkit.World world, int x, int y, int z) {
    org.bukkit.Location above = new org.bukkit.Location(world, (x + 0.5), y, (z + 0.5));
    return eu.j3t.gps.GPSMap.canPassThru(above.getBlock().getType());
}