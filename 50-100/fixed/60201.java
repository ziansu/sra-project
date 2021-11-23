@java.lang.Override
protected void mouseClicked(int x, int y, int type) throws java.io.IOException {
    if ((gate) == null) {
        return ;
    }
    super.mouseClicked(x, y, type);
    buildcraft.core.lib.gui.AdvancedSlot slot = getSlotAtLocation(x, y);
    if (slot != null) {
        doSlotClick(slot, type);
    }
}