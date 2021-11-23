@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack itemStack) {
    int meta = itemStack.getItemDamage();
    if ((meta < 0) || (meta >= (biomesoplenty.common.itemblocks.ItemBlockFruit.plants.length))) {
        meta = 0;
    }
    return ((super.getUnlocalizedName()) + ".") + (biomesoplenty.common.itemblocks.ItemBlockFruit.plants[meta]);
}