@java.lang.Override
public void onBlockAdded(final net.minecraft.world.World world, final net.minecraft.util.BlockPos coord, final net.minecraft.block.state.IBlockState state) {
    super.onBlockAdded(world, coord, state);
    cyano.poweradvantage.conduitnetwork.ConduitRegistry.getInstance().conduitBlockPlacedEvent(world, world.provider.getDimensionId(), coord, getType());
}