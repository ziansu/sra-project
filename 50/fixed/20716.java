@javax.annotation.Nullable
public net.minecraft.inventory.Slot getSlotOrNull(final int slotNumber) {
    return this.slotMap.getOrDefault(slotNumber, null);
}