@java.lang.Override
public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    net.minecraft.block.state.IBlockState state = getDefaultState();
    for (int i = 0; i < 4; ++i) {
        if ((meta & (1 << (farcore.lib.block.wood.BlockWoodenFence.I[i]))) != 0) {
            state = state.withProperty(nebula.common.data.Misc.PROPS_SIDE_HORIZONTALS[farcore.lib.block.wood.BlockWoodenFence.I[i]], true);
        }
    }
    return state;
}