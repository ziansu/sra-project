public void toggleWarHUD(org.bukkit.entity.Player p) {
    if (!(warUsers.contains(p))) {
        toggleAllOff(p);
        warUsers.add(p);
        com.palmergames.bukkit.towny.huds.WarHUD.toggleOn(p, plugin.getTownyUniverse().getWarEvent());
    }else
        toggleAllOff(p);
    
}