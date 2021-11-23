@java.lang.Override
public void onAssign(org.bukkit.inventory.ItemStack item, boolean unused) {
    if (!(item.getType().equals(Material.POTION)))
        return ;
    
    org.bukkit.inventory.meta.PotionMeta meta = ((org.bukkit.inventory.meta.PotionMeta) (item.getItemMeta()));
    for (org.bukkit.potion.PotionEffect effect : effects)
        meta.addCustomEffect(effect, false);
    
    meta.setMainEffect(effects.get(0).getType());
    item.setItemMeta(meta);
}