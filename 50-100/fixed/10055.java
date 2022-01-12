@java.lang.Override
protected void actionPerformed(net.minecraft.client.gui.GuiButton button) throws java.io.IOException {
    if ((button.id) == 0) {
        mc.displayGuiScreen(parent);
    }else {
        if (button.displayString.equals("Enable")) {
            button.displayString = "Disable";
        }else {
            button.displayString = "Enable";
        }
    }
}