public static org.bukkit.Location fromLocationString(java.lang.String string) {
    java.lang.String[] coords = string.split(":");
    java.lang.Double x = java.lang.Double.parseDouble(coords[0]);
    java.lang.Double y = java.lang.Double.parseDouble(coords[1]);
    java.lang.Double z = java.lang.Double.parseDouble(coords[2].split("=")[0]);
    org.bukkit.World world = org.bukkit.Bukkit.getWorld(string.split("=")[1]);
    return new org.bukkit.Location(world, x, y, z);
}