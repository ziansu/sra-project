public boolean canBlockStay(net.minecraft.world.World worldIn, com.bioxx.tfc2.blocks.BlockPos pos, net.minecraft.block.state.IBlockState state) {
    com.bioxx.tfc2.blocks.BlockPos down = pos.down();
    net.minecraft.block.state.IBlockState soil = worldIn.getBlockState(down);
    if ((state.getBlock()) != (this))
        return canPlaceBlockOn(soil);
    
    return soil.getBlock().canSustainPlant(worldIn, down, EnumFacing.UP, this);
}