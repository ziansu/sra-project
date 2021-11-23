@java.lang.Override
public void run() {
    try {
        jd.gui.swing.jdgui.JDGui.internalInitLocationAndDimension(mainFrame, logger, org.appwork.storage.config.JsonConfig.create(org.jdownloader.settings.GraphicalUserInterfaceSettings.class).getLastFrameStatus(), ((((tray) == null) || (!(tray.getSettings().isEnabled()))) || (!(tray.getSettings().isStartMinimizedEnabled()))), true);
    } finally {
        initThread = null;
    }
}