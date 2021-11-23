public boolean setCurrentMap(java.lang.String tag) {
    net.samongi.SamongiLib.Maps.MapData map = this.maps.get(tag);
    if (map == null)
        return false;
    
    net.samongi.PersistantPvP.GameManager.Events.MapChangeEvent event = new net.samongi.PersistantPvP.GameManager.Events.MapChangeEvent(this.current_map, map);
    org.bukkit.Bukkit.getServer().getPluginManager().callEvent(event);
    this.current_map = map;
    return true;
}