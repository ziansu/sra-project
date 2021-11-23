@java.lang.Override
public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    if ((meta >= 0) && (meta < (net.silentchaos512.gems.block.ChaosEssenceBlock.EnumType.values().length))) {
        return this.getDefaultState().withProperty(net.silentchaos512.gems.block.ChaosEssenceBlock.VARIANT, net.silentchaos512.gems.block.ChaosEssenceBlock.EnumType.values()[meta]);
    }
    return getDefaultState();
}