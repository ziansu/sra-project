private static int getStackAmount(org.bukkit.inventory.ItemStack item, org.bukkit.inventory.Inventory inventory, org.bukkit.entity.Player player, org.bukkit.event.block.Action action) {
    org.bukkit.event.block.Action buy = (com.Acrobot.ChestShop.Configuration.Properties.REVERSE_BUTTONS) ? org.bukkit.event.block.Action.LEFT_CLICK_BLOCK : org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK;
    org.bukkit.inventory.Inventory checkedInventory = (action == buy) ? inventory : player.getInventory();
    if (checkedInventory.containsAtLeast(item, item.getMaxStackSize())) {
        return item.getMaxStackSize();
    }else {
        return com.Acrobot.ChestShop.Listeners.Player.InventoryUtil.getAmount(item, checkedInventory);
    }
}