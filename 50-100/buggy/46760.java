@java.lang.Override
public net.minecraft.item.ItemStack slotClick(final int slotID, final int button, final int flag, final net.minecraft.entity.player.EntityPlayer player) {
    if ((slotID == (this.resultSlotNumber)) && (button == (thaumicenergistics.util.GuiHelper.MOUSE_BUTTON_RIGHT))) {
        return null;
    }
    return super.slotClick(slotID, button, flag, player);
}