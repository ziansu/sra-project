@java.lang.Override
public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    net.minecraft.block.state.IBlockState iblockstate = this.getDefaultState().withProperty(net.tropicraft.core.common.block.BlockTropicraftSlab.VARIANT, net.tropicraft.core.common.enums.TropicraftSlabs.byMetadata((meta & 7)));
    if (!(this.isDouble())) {
        iblockstate = iblockstate.withProperty(net.tropicraft.core.common.block.HALF, ((meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP));
    }
    java.lang.System.out.println(iblockstate);
    java.lang.System.out.println(meta);
    return iblockstate;
}