@java.lang.Override
protected void isBlockGoodForInterior(net.minecraft.world.World world, int x, int y, int z) throws reborncore.common.multiblock.MultiblockValidationException {
    net.minecraft.block.Block block = world.getBlockState(new net.minecraft.util.BlockPos(x, y, z)).getBlock();
    if (block.isAir(world, new net.minecraft.util.BlockPos(x, y, z))) {
    }else
        if (block.getUnlocalizedName().equals("tile.lava")) {
            hasLava = true;
        }else {
            super.isBlockGoodForInterior(world, x, y, z);
        }
    
}