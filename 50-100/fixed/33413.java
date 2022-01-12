public static void checkAndActivateCastleDoor(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos) {
    net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
    if ((((state.getBlock()) == (TFBlocks.castleDoor)) && (!(state.getValue(twilightforest.block.BlockTFCastleDoor.ACTIVE)))) && (!(twilightforest.block.BlockTFCastleDoor.isBlockLocked(world, pos)))) {
        twilightforest.block.BlockTFCastleDoor.changeToActiveBlock(world, pos, state);
    }
}