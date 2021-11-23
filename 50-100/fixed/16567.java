@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stack) {
    if ((stack.getItemDamage()) >= (ArtificeBlocks.rockBlockNames.length))
        return net.minecraft.block.Block.getBlockFromItem(stack.getItem()).getUnlocalizedName();
    
    return ((net.minecraft.block.Block.getBlockFromItem(stack.getItem()).getUnlocalizedName()) + ".") + (shukaro.artifice.ArtificeBlocks.rockBlockNames[stack.getItemDamage()]);
}