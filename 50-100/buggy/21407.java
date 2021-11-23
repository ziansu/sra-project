public boolean shouldDamage() {
    org.bukkit.entity.Player p;
    if ((p = org.bukkit.Bukkit.getPlayer(uuid)) == null)
        return false;
    
    org.bukkit.Location pearlLoc = pp.getLocation();
    if (pearlLoc instanceof vg.civcraft.mc.prisonpearl.misc.FakeLocation)
        return true;
    
    org.bukkit.Location playerLoc = p.getLocation();
    if (!(pearlLoc.getWorld().equals(playerLoc.getWorld())))
        return true;
    
    return (pearlLoc.distance(playerLoc)) <= (distance);
}