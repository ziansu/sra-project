@java.lang.Override
protected void onDisable() {
    fr.zcraft.zlib.components.gui.Gui.openGuis.clear();
    fr.zcraft.zlib.components.gui.Gui.guiListeners.clear();
}