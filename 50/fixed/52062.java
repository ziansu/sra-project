public void setStackInSlot(int slot, com.forgeessentials.jscripting.wrapper.mc.item.JsItemStack stack) {
    that.setInventorySlotContents(slot, (stack == null ? null : stack.getThat()));
}