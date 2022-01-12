public boolean isLeggings(org.bukkit.inventory.ItemStack item) {
    if (item == null) {
        return false;
    }
    return (((((item.getType()) == (org.bukkit.Material.DIAMOND_LEGGINGS)) || ((item.getType()) == (org.bukkit.Material.CHAINMAIL_LEGGINGS))) || ((item.getType()) == (org.bukkit.Material.GOLD_LEGGINGS))) || ((item.getType()) == (org.bukkit.Material.IRON_LEGGINGS))) || ((item.getType()) == (org.bukkit.Material.LEATHER_LEGGINGS));
}