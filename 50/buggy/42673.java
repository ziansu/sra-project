@java.lang.Override
public int getMetaFromState(net.minecraft.block.state.IBlockState state) {
    return state.getValue(net.came20.mods.simplemachines.blocks.BlockSimpleMachinesDirectional.FACING).getHorizontalIndex();
}