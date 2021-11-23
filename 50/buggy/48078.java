@java.lang.Override
protected void onPostBlockDestroyed(net.minecraft.world.World world, org.cyclops.integrateddynamics.block.BlockPos blockPos) {
    triggerNeighbourConnections(world, blockPos);
    super.onPostBlockDestroyed(world, blockPos);
}