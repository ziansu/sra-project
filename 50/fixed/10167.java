private int getPotionShift(net.minecraft.client.Minecraft mc) {
    if ((mc.currentScreen) instanceof net.minecraft.client.gui.inventory.GuiContainer) {
        net.minecraft.client.gui.inventory.GuiContainer guiContainer = ((net.minecraft.client.gui.inventory.GuiContainer) (mc.currentScreen));
        return (guiContainer.guiLeft) - (this.guiLeft);
    }
    return 0;
}