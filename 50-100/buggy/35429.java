public static net.minecraft.item.ItemStack applyItemDamage(net.minecraft.item.ItemStack itemstack) {
    if ((itemstack != null) && (itemstack.isItemStackDamageable())) {
        final int newDamageValue = (itemstack.getItemDamage()) + (cyano.lootable.entities.EntityLootableBody.additionalItemDamage);
        itemstack.setItemDamage(java.lang.Math.min(newDamageValue, ((itemstack.getMaxDamage()) - 1)));
    }
    return itemstack;
}