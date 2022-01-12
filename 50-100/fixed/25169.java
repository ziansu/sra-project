public void loadPlayerInventory(org.bukkit.entity.Player player) {
    if (inventories.containsKey(player.getUniqueId())) {
        com.wasteofplastic.askyblock.InventoryStore inv = inventories.get(player.getUniqueId());
        player.getInventory().setContents(inv.getInventory());
        player.getInventory().setArmorContents(inv.getArmor());
        inventories.remove(player.getUniqueId());
        return ;
    }
}