public static com.creativemd.littletiles.common.utils.LittleTile getLittleTile(net.minecraft.item.ItemStack stack) {
    if ((stack == null) || ((stack.stackTagCompound) == null))
        return null;
    
    return com.creativemd.littletiles.common.utils.LittleTile.CreateandLoadTile(stack.stackTagCompound);
}