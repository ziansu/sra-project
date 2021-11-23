@java.lang.Override
public boolean mousePressed(net.minecraft.client.Minecraft mc, int mouseX, int mouseY) {
    boolean pressed = super.mousePressed(mc, (mouseX - (this.parentGui.getGuiLeft())), mouseY);
    if (pressed) {
        if ((parentGui) instanceof net.minecraft.client.gui.inventory.GuiInventory) {
            PacketHandler.INSTANCE.sendToServer(new baubles.common.network.PacketOpenBaublesInventory(mouseX, mouseY));
        }else {
            ((baubles.client.gui.GuiPlayerExpanded) (parentGui)).displayNormalInventory();
            PacketHandler.INSTANCE.sendToServer(new baubles.common.network.PacketOpenNormalInventory());
        }
    }
    return pressed;
}