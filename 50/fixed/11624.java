@java.lang.Override
public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    return this.getDefaultState().withProperty(frogcraftrebirth.common.block.BlockHSU.LEVEL, frogcraftrebirth.common.block.BlockHSU.Level.values()[(meta % 2)]).withProperty(frogcraftrebirth.common.block.FACING_ALL, net.minecraft.util.EnumFacing.VALUES[(meta % 6)]);
}