public static boolean hasItemHandlerCap(net.minecraft.tileentity.TileEntity tileEntity, net.minecraft.util.EnumFacing face) {
    return (tileEntity != null) && (((tileEntity.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, face)) || (tileEntity instanceof net.minecraft.inventory.ISidedInventory)) || (tileEntity instanceof net.minecraft.inventory.IInventory));
}