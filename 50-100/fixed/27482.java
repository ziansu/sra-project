public net.minecraft.item.ItemStack getDrop() {
    me.dmillerw.storage.block.tile.TileController controller = getController();
    if (controller != null) {
        int slot = controller.getSlotForPosition(pos);
        if (slot == (-1))
            return net.minecraft.item.ItemStack.EMPTY;
        
        net.minecraft.item.ItemStack drop = controller.getStackInSlot(slot).copy();
        controller.setInventorySlotContents(slot, ItemStack.EMPTY);
        return drop;
    }else {
        return net.minecraft.item.ItemStack.EMPTY;
    }
}