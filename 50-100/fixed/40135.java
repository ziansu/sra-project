public boolean isWhitelisted(org.bukkit.Location location) {
    java.util.LinkedList<one.lindegaard.MobHunting.grinding.Area> areas = one.lindegaard.MobHunting.grinding.GrindingManager.mWhitelistedAreas.get(location.getWorld().getUID());
    if (areas == null)
        return false;
    
    for (one.lindegaard.MobHunting.grinding.Area area : areas) {
        if ((area.getCenter().distance(location)) < (area.getRange())) {
            return true;
        }
    }
    return false;
}