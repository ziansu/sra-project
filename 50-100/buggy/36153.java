public void onSlotChanged() {
    net.minecraft.item.ItemStack item = player.inventory.mainInventory[containerIndex];
    if ((valid) && ((item == null) || ((item.getItem()) != (containerWrapper.getContainerStack().getItem())))) {
        player.inventory.mainInventory[containerIndex] = containerWrapper.getContainerStack();
    }
}