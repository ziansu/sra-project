public static org.bukkit.inventory.ItemStack getBat() {
    org.bukkit.inventory.ItemStack bat = new org.bukkit.inventory.ItemStack(org.bukkit.Material.BOW);
    org.bukkit.inventory.meta.ItemMeta batMeta = bat.getItemMeta();
    java.util.List<java.lang.String> lore = new java.util.ArrayList<java.lang.String>();
    lore.add("SnowballGame Item");
    lore.add("Bat");
    batMeta.setLore(lore);
    java.lang.String name = com.github.kanesada2.SnowballGame.SnowballGame.getPlugin(com.github.kanesada2.SnowballGame.SnowballGame.class).getConfig().getString("Bat.Bat_Name");
    batMeta.setDisplayName(name);
    bat.setItemMeta(batMeta);
    return bat;
}