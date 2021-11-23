@org.bukkit.event.EventHandler
public void onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent event) {
    if (((event.getInventory()) instanceof org.bukkit.inventory.HorseInventory) && ((event.getInventory().getHolder()) instanceof org.bukkit.entity.Horse)) {
        org.bukkit.entity.Horse horse = ((org.bukkit.entity.Horse) (event.getInventory().getHolder()));
        if (utils.isHorseLocked(horse)) {
            us.drome.cobracorral.LockedHorse lhorse = config.Database.getHorse(horse.getUniqueId());
            utils.updateHorse(lhorse, horse);
        }
    }
}