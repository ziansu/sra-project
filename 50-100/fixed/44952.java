@java.lang.Override
public java.util.ArrayList<net.minecraft.item.ItemStack> getDrops(net.minecraft.world.World world, int x, int y, int z, int meta, int fortune) {
    if ((meta & 8) != 0) {
        y -= 1;
    }
    return binnie.core.block.BlockMetadata.getBlockDropped(this, world, x, y, z, meta);
}