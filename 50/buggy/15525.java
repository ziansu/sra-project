public void updateMasterBlock(net.minecraft.block.state.IBlockState state, boolean blockUpdate) {
    T master = master();
    if (master != null) {
        master.markDirty();
    }
}