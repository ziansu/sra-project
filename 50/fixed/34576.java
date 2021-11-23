@java.lang.Override
public boolean canExtractItem(int i, net.minecraft.item.ItemStack itemstack, int j) {
    return ((outputProgress) == (pneumaticCraft.common.tileentity.TileEntityPressureChamberInterface.MAX_PROGRESS)) && (j == (getRotation().ordinal()));
}