public static void closeChestMenus() {
    for (org.bukkit.entity.Player player : com.gmail.filoghost.chestcommands.util.VersionUtils.getOnlinePlayers()) {
        com.gmail.filoghost.chestcommands.InventoryView inventory = player.getOpenInventory();
        if (inventory != null) {
            if (((inventory.getTopInventory().getHolder()) instanceof com.gmail.filoghost.chestcommands.internal.MenuInventoryHolder) || ((inventory.getBottomInventory().getHolder()) instanceof com.gmail.filoghost.chestcommands.internal.MenuInventoryHolder)) {
                player.closeInventory();
            }
        }
    }
}