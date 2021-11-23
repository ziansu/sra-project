private boolean checkGear(net.minecraft.entity.player.EntityPlayer player) {
    net.minecraft.inventory.IInventory baubles = com.InfinityRaider.maneuvergear.utility.BaublesWrapper.getInstance().getBaubles(player);
    net.minecraft.item.ItemStack belt = baubles.getStackInSlot(com.InfinityRaider.maneuvergear.handler.DartHandler.BELT_SLOT);
    return ((belt != null) && ((belt.getItem()) != null)) && ((belt.getItem()) instanceof com.InfinityRaider.maneuvergear.item.ItemManeuverGear);
}