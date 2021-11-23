@java.lang.Override
public boolean isItemValid(net.minecraft.item.ItemStack p_75214_1_) {
    if (!((this.inventory) instanceof infiniteinvo.inventory.BigInventoryPlayer)) {
        java.lang.System.out.println("WARNING: Modified slot used for non modified inventory!");
        return true;
    }else
        if ((((infiniteinvo.inventory.BigInventoryPlayer) (this.inventory)).getUnlockedSlots()) > (this.slotIndex)) {
            return true;
        }else {
            return false;
        }
    
}