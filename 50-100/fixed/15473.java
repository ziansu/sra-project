public net.minecraftforge.items.IItemHandler getItemHandlerAt(mcjty.rftoolscontrol.logic.registry.Inventory inv) {
    net.minecraft.tileentity.TileEntity te = getTileEntityAt(inv);
    if ((te != null) && (te.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, inv.getIntSide()))) {
        net.minecraftforge.items.IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, inv.getIntSide());
        if (handler != null) {
            return handler;
        }
    }
    throw new mcjty.rftoolscontrol.logic.running.ProgException(EXCEPT_INVALIDINVENTORY);
}