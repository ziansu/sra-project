public static boolean safeSetBlock(net.minecraft.world.World world, int x, int y, int z, net.minecraft.block.Block block) {
    net.minecraft.block.Block blockToReplace = world.getBlock(x, y, z);
    if ((blockToReplace.getBlockHardness(world, x, y, z)) > 0.0F)
        return world.setBlock(x, y, z, block);
    
    return false;
}