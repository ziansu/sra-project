@java.lang.Override
public int colorMultiplier(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess worldIn, net.minecraft.util.math.BlockPos pos, int tintIndex) {
    int meta = state.getBlock().getMetaFromState(state);
    zmaster587.libVulpes.api.material.Material mat = ((zmaster587.libVulpes.block.BlockOre) (state.getBlock())).ores[meta];
    if (mat != null)
        return mat.getColor();
    
    return 16777215;
}