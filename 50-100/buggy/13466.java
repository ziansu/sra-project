public boolean isValidBook(net.minecraft.item.ItemStack itemStack) {
    return ((itemStack.getItem()) == (net.minecraft.init.Items.enchanted_book)) && (((net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, inventory[21])) > 0) || ((net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, inventory[21])) > 0));
}