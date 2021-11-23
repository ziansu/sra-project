public com.Ben12345rocks.AdvancedCore.Util.Item.ItemBuilder addLoreLine(java.lang.String line) {
    org.bukkit.inventory.meta.ItemMeta im = is.getItemMeta();
    java.util.List<java.lang.String> lore = new java.util.ArrayList<>();
    if (im.hasLore())
        lore = new java.util.ArrayList(im.getLore());
    
    lore.add(line);
    return setLore(lore);
}