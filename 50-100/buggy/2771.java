public void close() {
    if (!(org.bukkit.Bukkit.getOnlinePlayers().isEmpty())) {
        for (org.bukkit.entity.Player all : org.bukkit.Bukkit.getOnlinePlayers()) {
            org.bukkit.inventory.Inventory top = all.getOpenInventory().getTopInventory();
            if ((top != null) && (isShop(top.getTitle()))) {
                all.closeInventory();
                all.sendMessage(((org.bukkit.ChatColor.RED) + "[TM] All shops are automatically closed on reload."));
            }
        }
    }
}