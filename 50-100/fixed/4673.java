public org.bukkit.World getWorld(java.lang.String worldname) {
    for (java.lang.Object world : this.getServer().getWorlds().toArray()) {
        if (!(world instanceof org.bukkit.World))
            continue;
        
        if (((org.bukkit.World) (world)).getName().equalsIgnoreCase(worldname)) {
            return ((org.bukkit.World) (world));
        }
    }
    return null;
}