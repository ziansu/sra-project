@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack itemstack) {
    if (((itemstack.getItemDamage()) > 0) && ((itemstack.getItemDamage()) <= (infinitealloys.util.Consts.VALID_ALLOY_COUNT))) {
        return "item." + (infinitealloys.util.EnumAlloy.values()[((itemstack.getItemDamage()) - 1)].name);
    }
    return super.getUnlocalizedName(itemstack);
}