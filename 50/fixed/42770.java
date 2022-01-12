public boolean isItemEnchanted(org.bukkit.inventory.ItemStack item, org.bukkit.enchantments.Enchantment enchantment) {
    if (item == null) {
        return false;
    }
    return item.containsEnchantment(enchantment);
}