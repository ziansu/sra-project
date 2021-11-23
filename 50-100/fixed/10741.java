@java.lang.Override
public net.minecraft.item.ItemStack getStack() {
    if (!((this.inventory) instanceof infiniteinvo.inventory.BigInventoryPlayer)) {
        return this.inventory.getStackInSlot(this.slotIndex);
    }else
        if ((((infiniteinvo.inventory.BigInventoryPlayer) (this.inventory)).getUnlockedSlots()) > (this.slotIndex)) {
            return this.inventory.getStackInSlot(this.slotIndex);
        }else {
            return lockedStack.copy();
        }
    
}