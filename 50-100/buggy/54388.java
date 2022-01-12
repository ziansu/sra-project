private void syncStacks() {
    if ((this.te) != null) {
        if ((this.slots) == null)
            this.slots = new net.minecraft.item.ItemStack[numSlots];
        
        for (int i = 0; i < (this.slots.length); i++) {
            this.slots[i] = this.te.getStackInSlot((i + 1));
        }
    }
}