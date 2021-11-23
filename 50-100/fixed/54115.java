@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
public void onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent event) {
    if (((event.getAction()) == (org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK)) && ((event.getClickedBlock().getType()) == (org.bukkit.Material.ENCHANTMENT_TABLE))) {
        event.setCancelled(true);
        org.bukkit.entity.Player thePlayer = event.getPlayer();
        Enchantism.openInventories.put(thePlayer, new tk.thundaklap.enchantism.EnchantInventory(thePlayer, event.getClickedBlock().getLocation(), tk.thundaklap.enchantism.Enchantism.getInstance().configuration.requireBookshelves));
    }
}