public void broadcast(java.util.UUID pearled) {
    java.util.List<java.util.UUID> uuids = broadcasts.get(pearled);
    if (uuids == null)
        return ;
    
    vg.civcraft.mc.prisonpearl.managers.MercuryManager.sendBroadcast(pearled, uuids);
    vg.civcraft.mc.prisonpearl.PrisonPearl pp = vg.civcraft.mc.prisonpearl.PrisonPearlPlugin.getPrisonPearlManager().getByImprisoned(pearled);
    for (java.util.UUID uuid : uuids) {
        org.bukkit.entity.Player p;
        if ((p = org.bukkit.Bukkit.getPlayer(uuid)) != null)
            broadcastMessage(p, pp);
        
    }
}