@org.bukkit.event.EventHandler
public void OnEntityDamageByEntity(org.bukkit.event.entity.EntityDamageByEntityEvent e) {
    if ((e.getDamager()) instanceof org.bukkit.entity.Player) {
        org.bukkit.entity.Player p = ((org.bukkit.entity.Player) (e.getDamager()));
        US.bittiez.TotalTracker.QueObject de = new US.bittiez.TotalTracker.QueObject(p.getUniqueId().toString(), SQLTABLE.DAMAGE_CAUSED, p.getDisplayName());
        de.Quantity = ((int) (e.getFinalDamage()));
        QueObjects.add(de);
        checkQue();
    }
}