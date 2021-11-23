public boolean isSword(org.bukkit.inventory.ItemStack item) {
    if (item == null) {
        return false;
    }
    return ((((item.getType()) == (org.bukkit.Material.DIAMOND_SWORD)) || ((item.getType()) == (org.bukkit.Material.WOOD_SWORD))) || ((item.getType()) == (org.bukkit.Material.GOLD_SWORD))) || ((item.getType()) == (org.bukkit.Material.IRON_SWORD));
}