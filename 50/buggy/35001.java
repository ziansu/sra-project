public static com.creativemd.littletiles.common.utils.LittleTile getLittleTile(net.minecraft.item.ItemStack stack) {
    return com.creativemd.littletiles.common.utils.LittleTile.CreateandLoadTile(stack.stackTagCompound);
}