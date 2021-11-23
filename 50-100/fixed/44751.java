private boolean canFenceConnectTo(net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos, net.minecraft.util.EnumFacing facing) {
    net.minecraft.block.Block block = world.getBlockState(pos.offset(facing)).getBlock();
    return (block.canBeConnectedTo(world, pos.offset(facing), facing.getOpposite())) || (canConnectTo(world, pos));
}