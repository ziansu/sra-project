@java.lang.Override
public void run() {
    try {
        internalInitLocationAndDimension(mainFrame, logger, org.appwork.storage.config.JsonConfig.create(org.jdownloader.settings.GraphicalUserInterfaceSettings.class).getLastFrameStatus(), ((((tray) == null) || (!(tray.getSettings().isEnabled()))) || (!(tray.getSettings().isStartMinimizedEnabled()))), true);
    } finally {
        initThread = null;
    }
}