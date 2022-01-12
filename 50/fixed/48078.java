@java.lang.Override
protected void onPostBlockDestroyed(net.minecraft.world.World world, org.cyclops.integrateddynamics.block.BlockPos blockPos) {
    super.onPostBlockDestroyed(world, blockPos);
    triggerNeighbourConnections(world, blockPos);
}