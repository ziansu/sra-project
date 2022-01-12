public boolean matches(net.minecraft.world.World world, int x, int y, int z) {
    net.minecraft.block.Block blockOf = world.getBlock(x, y, z);
    if ((blockOf.equals(targetBlock)) && ((targetMetadata) == 0))
        return true;
    
    if ((blockOf.equals(targetBlock)) && ((targetMetadata) == (world.getBlockMetadata(x, y, z))))
        return true;
    
    return false;
}