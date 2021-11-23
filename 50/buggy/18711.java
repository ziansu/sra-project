public void display(boolean cancelClose) {
    net.malisis.core.client.gui.MalisisGui.cancelClose = false;
    net.minecraft.client.Minecraft.getMinecraft().displayGuiScreen(this);
}