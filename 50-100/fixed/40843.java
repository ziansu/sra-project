private org.bukkit.inventory.ItemStack[] getArmor(org.bukkit.entity.Player player) {
    org.bukkit.inventory.ItemStack shirt = new org.bukkit.inventory.ItemStack(org.bukkit.Material.LEATHER_CHESTPLATE);
    org.bukkit.inventory.meta.LeatherArmorMeta meta = ((org.bukkit.inventory.meta.LeatherArmorMeta) (shirt.getItemMeta()));
    meta.setColor(getArmorColor(meta.getColor(), player));
    shirt.setItemMeta(meta);
    return new org.bukkit.inventory.ItemStack[]{ new org.bukkit.inventory.ItemStack(org.bukkit.Material.CHAINMAIL_BOOTS) , new org.bukkit.inventory.ItemStack(org.bukkit.Material.CHAINMAIL_LEGGINGS) , shirt , new org.bukkit.inventory.ItemStack(org.bukkit.Material.CHAINMAIL_HELMET) };
}