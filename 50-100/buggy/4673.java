public org.bukkit.World getWorld(java.lang.String worldname) {
    for (org.bukkit.World world : ((org.bukkit.World[]) (this.getServer().getWorlds().toArray()))) {
        if (world.getName().equalsIgnoreCase(worldname)) {
            return world;
        }
    }
    return null;
}