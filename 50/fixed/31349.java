@java.lang.Override
protected void onPostBlockDestroyed(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos) {
    super.onPostBlockDestroyed(world, pos);
    if (!(org.cyclops.integrateddynamics.block.BlockCable.IS_MCMP_CONVERTING)) {
        cableNetworkComponent.onPostBlockDestroyed(world, pos);
    }
    org.cyclops.integrateddynamics.block.BlockCable.IS_MCMP_CONVERTING = false;
}