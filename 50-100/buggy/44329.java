public static org.bukkit.inventory.ItemStack makeItem(org.bukkit.inventory.ItemStack itemStack, java.lang.String title, java.util.List<java.lang.String> loreLines) {
    org.bukkit.inventory.meta.ItemMeta meta = itemStack.getItemMeta();
    meta.setDisplayName(title);
    meta.setLore(loreLines);
    if (itemStack.getType().equals(Material.MAP))
        fr.zcraft.zlib.components.gui.GuiUtils.hideItemAttributes(meta);
    
    itemStack.setItemMeta(meta);
    return itemStack;
}