public void processMessage(java.lang.String logName, java.lang.String text, java.awt.Color col, boolean clear) {
    net.minecraft.client.gui.GuiScreen gui = net.minecraft.client.Minecraft.getMinecraft().currentScreen;
    if (gui instanceof com.Da_Technomancer.crossroads.API.gui.ILogUser) {
        com.Da_Technomancer.crossroads.API.gui.OutputLogGuiObject log = ((com.Da_Technomancer.crossroads.API.gui.ILogUser) (gui)).getLog(logName);
        if (log != null) {
            if (clear) {
                log.clearLog();
            }
            log.addText(text, col);
        }
    }
}