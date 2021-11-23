@java.lang.Override
public boolean isSameInventory(net.minecraft.inventory.Slot slot) {
    return slot instanceof tamaized.voidcraft.common.gui.slots.SlotVadeMecumSpell ? (((tamaized.voidcraft.common.gui.slots.SlotVadeMecumSpell) (slot)).getCapability()) == (capability) : false;
}