public boolean checkForGroundProximity(net.minecraft.util.BlockPos bp) {
    net.minecraft.block.Block block = worldObj.getBlockState(bp).getBlock();
    boolean isAir = block == (net.minecraft.init.Blocks.air);
    boolean isVegetation = ((block instanceof net.minecraft.block.BlockFlower) || (block instanceof net.minecraft.block.BlockGrass)) || (block instanceof net.minecraft.block.BlockLeaves);
    return (!isAir) && (!isVegetation);
}