@java.lang.Override
protected void mouseClicked(net.minecraft.util.BlockPos pos) {
    if ((gate) == null) {
        return ;
    }
    super.mouseClicked(pos);
    buildcraft.core.lib.gui.AdvancedSlot slot = getSlotAtLocation(i, j);
    if (slot != null) {
        doSlotClick(slot, k);
    }
}