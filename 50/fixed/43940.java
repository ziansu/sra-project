@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stack) {
    net.minecraft.item.ItemStack block = new net.minecraft.item.ItemStack(getBlockFromStack(stack));
    return block != null ? block.getUnlocalizedName() : Blocks.stone.getUnlocalizedName();
}