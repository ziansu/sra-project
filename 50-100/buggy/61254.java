private net.minecraft.item.ItemStack fillCustomBucket(net.minecraft.world.World world, net.minecraft.util.math.RayTraceResult location) {
    net.minecraft.util.math.BlockPos pos = location.getBlockPos();
    net.minecraft.block.Block block = world.getBlockState(pos).getBlock();
    net.minecraft.item.Item bucket = buckets.get(block);
    if ((bucket != null) && ((block.getMetaFromState(world.getBlockState(pos))) == 0)) {
        world.setBlockToAir(pos);
        return new net.minecraft.item.ItemStack(bucket);
    }else
        return null;
    
}