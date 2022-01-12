private void addVine(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.properties.PropertyBool prop) {
    net.minecraft.block.state.IBlockState iblockstate = IWTechBlocks.blockEnderVine.getDefaultState().withProperty(prop, true);
    this.setBlockAndNotifyAdequately(worldIn, pos, iblockstate);
    int i = 4;
    for (pos = pos.down(); (isAir(worldIn, pos)) && (i > 0); --i) {
        this.setBlockAndNotifyAdequately(worldIn, pos, iblockstate);
        pos = pos.down();
    }
}