@java.lang.Override
public int getLightValue(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    if ((EnumOre.FIRESTONE) == (getVariant(state)))
        return 15;
    
    return super.getLightValue(state, world, pos);
}