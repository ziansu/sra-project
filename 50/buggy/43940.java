@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stack) {
    net.minecraft.block.Block block = getBlockFromStack(stack);
    return block != null ? block.getUnlocalizedName() : Blocks.stone.getUnlocalizedName();
}