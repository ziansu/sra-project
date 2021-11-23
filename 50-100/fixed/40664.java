private void checkGhostStacks() {
    net.minecraftforge.items.IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
    for (int i = 0; i < (TE_VEND_MAIN_TOTAL_COUNT); i++) {
        if ((tile.isGhostSlot(i)) && ((itemHandler.getStackInSlot((i + 1)).getCount()) > 1)) {
            itemHandler.getStackInSlot((i + 1)).shrink(1);
            tile.setGhostSlot(i, false);
        }
    }
}