@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onPlayerClosesInventory(org.bukkit.event.inventory.InventoryCloseEvent ev) {
    if (com.pgcraft.spectatorplus.SpectatorPlus.get().getPlayerData(((org.bukkit.entity.Player) (ev.getPlayer()))).isSpectating()) {
        if (ev.getInventory().equals(ev.getPlayer().getInventory())) {
            com.pgcraft.spectatorplus.SpectatorPlus.get().getSpectatorsManager().getInventoryManager().updateNewbieTips(((org.bukkit.entity.Player) (ev.getPlayer())), false);
        }
    }
}