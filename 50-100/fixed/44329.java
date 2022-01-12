public static org.bukkit.inventory.ItemStack makeItem(org.bukkit.inventory.ItemStack itemStack, java.lang.String title, java.util.List<java.lang.String> loreLines) {
    org.bukkit.inventory.meta.ItemMeta meta = itemStack.getItemMeta();
    if (title != null)
        meta.setDisplayName(title);
    
    if (loreLines != null)
        meta.setLore(loreLines);
    
    itemStack.setItemMeta(meta);
    return itemStack;
}