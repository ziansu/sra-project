public float getEffectiveLuck() {
    net.minecraft.item.ItemStack meshStack = meshSlots.getStackInSlot(0);
    if (meshStack != null) {
        return 1.0F + (net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, meshStack));
    }
    return 1.0F;
}