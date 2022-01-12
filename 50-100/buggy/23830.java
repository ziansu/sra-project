public static org.bukkit.inventory.ItemStack removeGlow(ml.lasertag.minigame.api.ItemStack item) {
    ml.lasertag.minigame.api.ItemStack gun = new ml.lasertag.minigame.api.ItemStack(org.bukkit.Material.IRON_BARDING);
    org.bukkit.inventory.meta.ItemMeta meta = gun.getItemMeta();
    org.bukkit.inventory.meta.ItemMeta oldMeta = item.getItemMeta();
    if (oldMeta.hasDisplayName())
        meta.setDisplayName(oldMeta.getDisplayName());
    
    if (oldMeta.hasLore())
        meta.setLore(oldMeta.getLore());
    
    gun.setItemMeta(meta);
    return gun;
}