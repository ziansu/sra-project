@org.bukkit.event.EventHandler
public void onInventoryClickEvent(org.bukkit.event.inventory.InventoryClickEvent event) {
    org.bukkit.inventory.ItemStack item = event.getCurrentItem();
    if (((item.hasItemMeta()) && (item.getItemMeta().hasLore())) && (item.getItemMeta().getLore().contains("BjornNotice GUI"))) {
        event.setCancelled(true);
    }
}