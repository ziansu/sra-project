@org.bukkit.event.EventHandler
public void onPearlDrop(com.minegusta.mgracesredone.listeners.racelisteners.PlayerDropItemEvent e) {
    if (!(com.minegusta.mgracesredone.listeners.racelisteners.WorldCheck.isEnabled(e.getPlayer().getWorld())))
        return ;
    
    if (((e.getItemDrop().getItemStack().getType()) == (org.bukkit.Material.ENDER_PEARL)) && (com.minegusta.mgracesredone.main.Races.getMGPlayer(e.getPlayer()).hasAbility(AbilityType.ENDERSHIELD))) {
        AbilityType.ENDERSHIELD.run(e);
        org.bukkit.Bukkit.getLogger().info("Endershield charge added.");
    }
}