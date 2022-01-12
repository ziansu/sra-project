@java.lang.Override
public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    return this.getDefaultState().withProperty(tko.pnpnpn.common.block.BlockLogicD.INSIDE, java.lang.Boolean.valueOf(((meta & 1) == 1))).withProperty(tko.pnpnpn.common.block.BlockLogicD.OUTSIDE, java.lang.Boolean.valueOf(((meta & 2) == 1)));
}