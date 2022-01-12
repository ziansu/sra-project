private int getPotionShift(net.minecraft.client.Minecraft mc) {
    if ((mc.currentScreen) instanceof net.minecraft.client.gui.inventory.GuiContainer) {
        net.minecraft.client.gui.inventory.GuiContainer guiContainer = ((net.minecraft.client.gui.inventory.GuiContainer) (mc.currentScreen));
        return (this.guiLeft) - (guiContainer.guiLeft);
    }
    return 0;
}