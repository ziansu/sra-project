@java.lang.Override
public void onTick() {
    if (!(net.minecraft.item.ItemStack.areItemStacksEqual(lastSended, slot.getStack()))) {
        sendUpdate();
        raiseEvent(new com.creativemd.creativecore.gui.event.container.SlotChangeEvent(this));
    }
}