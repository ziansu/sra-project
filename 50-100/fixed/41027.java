public static org.bukkit.inventory.ItemStack setItemStackNameAndLore(org.bukkit.inventory.ItemStack item, java.lang.String displayName, java.util.List<java.lang.String> lore) {
    org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();
    if (meta != null) {
        meta.setDisplayName(displayName);
        meta.setLore(lore);
        item.setItemMeta(meta);
    }
    return item;
}