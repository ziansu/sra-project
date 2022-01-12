public boolean removedByPlayer(net.minecraft.block.state.IBlockState state, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.entity.player.EntityPlayer player, boolean willHarvest) {
    if (willHarvest) {
        return true;
    }
    return super.removedByPlayer(state, world, pos, player, willHarvest);
}