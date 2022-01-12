public void display(boolean cancelClose) {
    net.malisis.core.client.gui.MalisisGui.cancelClose = cancelClose;
    net.minecraft.client.Minecraft.getMinecraft().displayGuiScreen(this);
}