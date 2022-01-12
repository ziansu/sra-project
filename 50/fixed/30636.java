public static boolean hasTracker(org.bukkit.entity.Player p) {
    if ((com.aetheriumwars.stickytracker.StickyTracker.getTrackers().get(p.getUniqueId())) == null)
        return false;
    else
        return true;
    
}