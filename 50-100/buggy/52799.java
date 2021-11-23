public boolean oneCanPlace(java.util.Set<java.util.UUID> players) {
    vg.civcraft.mc.citadel.reinforcement.PlayerReinforcement reinforcement = getReinforcement();
    if (reinforcement == null)
        return true;
    
    for (java.util.UUID player : players) {
        if (player != null)
            if (reinforcement.isAccessible(org.bukkit.Bukkit.getPlayer(player)))
                return true;
            
        
    }
    return false;
}