@java.lang.Override
public net.minecraft.util.EnumFacing getBedDirection(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    net.minecraft.tileentity.TileEntity tileEntity = world.getTileEntity(pos);
    if (tileEntity instanceof micdoodle8.mods.galacticraft.core.tile.TileEntityMulti) {
        net.minecraft.util.math.BlockPos mainBlockPosition = ((micdoodle8.mods.galacticraft.core.tile.TileEntityMulti) (tileEntity)).mainBlockPosition;
        if ((mainBlockPosition != null) && (!(mainBlockPosition.equals(pos)))) {
            net.minecraft.block.state.IBlockState mainState = world.getBlockState(mainBlockPosition);
            return mainState.getBlock().getBedDirection(mainState, world, pos);
        }
    }
    return net.minecraft.util.EnumFacing.UP;
}