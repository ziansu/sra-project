@java.lang.Override
public int damageDropped(net.minecraft.block.state.IBlockState iBlockState) {
    fi.dy.masa.enderutilities.block.machine.Machine machine = fi.dy.masa.enderutilities.block.machine.Machine.getMachine(this.blockIndex, this.getMetaFromState(iBlockState));
    if (machine != null) {
        java.lang.System.out.println(("createNewTileEntity(), machine: " + machine));
        return machine.damageDropped();
    }
    return this.getMetaFromState(iBlockState);
}