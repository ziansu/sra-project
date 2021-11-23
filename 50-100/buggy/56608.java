public team.unstudio.udpl.api.item.ItemBuilder addLore(java.lang.String... lore) {
    org.bukkit.inventory.meta.ItemMeta meta = itemStack.getItemMeta();
    java.util.ArrayList<java.lang.String> lores = new java.util.ArrayList(meta.getLore());
    java.util.Collections.addAll(lores, lore);
    meta.setLore(lores);
    itemStack.setItemMeta(meta);
    return this;
}